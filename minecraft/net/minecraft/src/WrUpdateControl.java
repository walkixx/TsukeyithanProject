package net.minecraft.src;

public class WrUpdateControl implements IUpdateControl
{
    private boolean hasForge;
    private int renderPass;

    public WrUpdateControl()
    {
        hasForge = Reflector.hasClass(1);
        renderPass = 0;
    }

    public void resume()
    {
        if (hasForge)
        {
            Reflector.callVoid(13, new Object[]
                    {
                        Integer.valueOf(renderPass)
                    });
        }
    }

    public void pause()
    {
        if (hasForge)
        {
            Reflector.callVoid(14, new Object[]
                    {
                        Integer.valueOf(renderPass)
                    });
        }
    }

    public void setRenderPass(int i)
    {
        renderPass = i;
    }
}
