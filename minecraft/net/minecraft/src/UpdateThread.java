package net.minecraft.src;

import java.util.LinkedList;
import java.util.List;
import org.lwjgl.opengl.Pbuffer;

public class UpdateThread extends Thread
{
    private class ThreadUpdateListener
        implements IUpdateListener
    {
        private ThreadUpdateControl tuc;

        public void updating(IUpdateControl iupdatecontrol)
        {
            tuc.setUpdateControl(iupdatecontrol);
            checkCanWork(tuc);
        }

        private ThreadUpdateListener()
        {
            tuc = new ThreadUpdateControl();
        }
    }

    private class ThreadUpdateControl
        implements IUpdateControl
    {
        private IUpdateControl updateControl;
        private boolean paused;

        public void pause()
        {
            if (!paused)
            {
                paused = true;
                updateControl.pause();
                Tessellator.instance = mainTessellator;
            }
        }

        public void resume()
        {
            if (paused)
            {
                paused = false;
                Tessellator.instance = threadTessellator;
                updateControl.resume();
            }
        }

        public void setUpdateControl(IUpdateControl iupdatecontrol)
        {
            updateControl = iupdatecontrol;
        }

        private ThreadUpdateControl()
        {
            updateControl = null;
            paused = false;
        }
    }

    private Pbuffer pbuffer;
    private Object lock;
    private List updateList;
    private List updatedList;
    private int updateCount;
    private Tessellator mainTessellator;
    private Tessellator threadTessellator;
    private boolean working;
    private WorldRenderer currentRenderer;
    private boolean canWork;
    private boolean canWorkToEndOfUpdate;
    private static final int MAX_UPDATE_CAPACITY = 10;

    public UpdateThread(Pbuffer pbuffer1)
    {
        super("UpdateThread");
        pbuffer = null;
        lock = new Object();
        updateList = new LinkedList();
        updatedList = new LinkedList();
        updateCount = 0;
        mainTessellator = Tessellator.instance;
        threadTessellator = new Tessellator(0x200000);
        working = false;
        currentRenderer = null;
        canWork = false;
        canWorkToEndOfUpdate = false;
        pbuffer = pbuffer1;
    }

    public void run()
    {
        try
        {
            pbuffer.makeCurrent();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        ThreadUpdateListener threadupdatelistener = new ThreadUpdateListener();

        while (!Thread.interrupted())
        {
            try
            {
                WorldRenderer worldrenderer = getRendererToUpdate();
                checkCanWork(null);

                try
                {
                    Tessellator.instance = threadTessellator;
                    worldrenderer.updateRenderer(threadupdatelistener);
                }
                finally
                {
                    Tessellator.instance = mainTessellator;
                }

                rendererUpdated(worldrenderer);
            }
            catch (Exception exception1)
            {
                exception1.printStackTrace();

                if (currentRenderer != null)
                {
                    currentRenderer.isUpdating = false;
                    currentRenderer.needsUpdate = true;
                }

                currentRenderer = null;
                working = false;
            }
        }
    }

    public void addRendererToUpdate(WorldRenderer worldrenderer, boolean flag)
    {
        synchronized (lock)
        {
            if (worldrenderer.isUpdating)
            {
                throw new IllegalArgumentException("Renderer already updating");
            }

            if (flag)
            {
                updateList.add(0, worldrenderer);
            }
            else
            {
                updateList.add(worldrenderer);
            }

            worldrenderer.isUpdating = true;
            lock.notifyAll();
        }
    }

    private WorldRenderer getRendererToUpdate()
    {
        synchronized (lock)
        {
            while (updateList.size() <= 0)
            {
                try
                {
                    lock.wait();
                }
                catch (InterruptedException interruptedexception) { }
            }

            currentRenderer = (WorldRenderer)updateList.remove(0);
            lock.notifyAll();
            return currentRenderer;
        }
    }

    public boolean hasWorkToDo()
    {
        synchronized (lock)
        {
            if (updateList.size() > 0)
            {
                return true;
            }

            if (currentRenderer != null)
            {
                return true;
            }
            else
            {
                return working;
            }
        }
    }

    public int getUpdateCapacity()
    {
        synchronized (lock)
        {
            if (updateList.size() > 10)
            {
                return 0;
            }
            else
            {
                return 10 - updateList.size();
            }
        }
    }

    private void rendererUpdated(WorldRenderer worldrenderer)
    {
        synchronized (lock)
        {
            updatedList.add(worldrenderer);
            updateCount++;
            currentRenderer = null;
            working = false;
            lock.notifyAll();
        }
    }

    private void finishUpdatedRenderers()
    {
        synchronized (lock)
        {
            for (int i = 0; i < updatedList.size(); i++)
            {
                WorldRenderer worldrenderer = (WorldRenderer)updatedList.get(i);
                worldrenderer.finishUpdate();
                worldrenderer.isUpdating = false;
            }

            updatedList.clear();
        }
    }

    public void pause()
    {
        synchronized (lock)
        {
            canWork = false;
            canWorkToEndOfUpdate = false;
            lock.notifyAll();

            while (working)
            {
                try
                {
                    lock.wait();
                }
                catch (InterruptedException interruptedexception) { }
            }

            finishUpdatedRenderers();
        }
    }

    public void unpause()
    {
        synchronized (lock)
        {
            if (working)
            {
                Config.dbg("UpdateThread still working in unpause()!!!");
            }

            canWork = true;
            canWorkToEndOfUpdate = false;
            lock.notifyAll();
        }
    }

    public void unpauseToEndOfUpdate()
    {
        synchronized (lock)
        {
            if (working)
            {
                Config.dbg("UpdateThread still working in unpause()!!!");
            }

            if (currentRenderer == null)
            {
                return;
            }

            while (currentRenderer != null)
            {
                canWork = false;
                canWorkToEndOfUpdate = true;
                lock.notifyAll();

                try
                {
                    lock.wait();
                }
                catch (InterruptedException interruptedexception) { }
            }

            pause();
        }
    }

    private void checkCanWork(IUpdateControl iupdatecontrol)
    {
        Thread.yield();

        synchronized (lock)
        {
            while (!canWork && (!canWorkToEndOfUpdate || currentRenderer == null))
            {
                if (iupdatecontrol != null)
                {
                    iupdatecontrol.pause();
                }

                working = false;
                lock.notifyAll();

                try
                {
                    lock.wait();
                }
                catch (InterruptedException interruptedexception) { }
            }

            working = true;

            if (iupdatecontrol != null)
            {
                iupdatecontrol.resume();
            }

            lock.notifyAll();
        }
    }

    public void clearAllUpdates()
    {
        synchronized (lock)
        {
            unpauseToEndOfUpdate();
            updateList.clear();
            lock.notifyAll();
        }
    }

    public int getPendingUpdatesCount()
    {
        synchronized (lock)
        {
            int i = updateList.size();

            if (currentRenderer != null)
            {
                i++;
            }

            return i;
        }
    }

    public int resetUpdateCount()
    {
        synchronized (lock)
        {
            int i = updateCount;
            updateCount = 0;
            return i;
        }
    }
}
