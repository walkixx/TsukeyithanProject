/** FILE ContainerPlayer **/
/** Fichier modifié ar chaipokoi**/
/** Notes:
	ration de réduction : 
		largeur:283/1280
		hauteur:53/240**/ 
package net.minecraft.src;
import Tsukeyithan.Gui.GuiTools;
import java.util.List;

public class ContainerPlayer extends Container
{
    /** The crafting matrix inventory. */
    public InventoryCrafting craftMatrix;
    public IInventory craftResult;

    /** Determines if inventory manipulation should be handled. */
    public boolean isLocalWorld;

    public ContainerPlayer(InventoryPlayer par1InventoryPlayer)
    {
        this(par1InventoryPlayer, true);
    }
    /**
     * MODIF ContainerPlayer:  ContainerPlayer(InventoryPlayer par1InventoryPlayer, boolean par2)
     */
    public ContainerPlayer(InventoryPlayer par1InventoryPlayer, boolean par2)
    {
        craftMatrix = new InventoryCrafting(this, 2, 2);
        craftResult = new InventoryCraftResult();
        isLocalWorld = false;
        isLocalWorld = par2;
        addSlot(new SlotCrafting(par1InventoryPlayer.player, craftMatrix, craftResult, 0, 144, 36));

        for (int i = 0; i < 2; i++)
        {
            for (int i1 = 0; i1 < 2; i1++)
            {
                addSlot(new Slot(craftMatrix, i1 + i * 2, 88 + i1 * 18, 26 + i * 18));
            }
        }

        for (int j = 0; j < 4; j++)
        {
            int j1 = j;
            addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - j, 8, 8 + j * 18, j1));
        }


	//affichage des slots de l'inventaire
		//première ligne 
		float ratioX=GuiTools.getXSizeInventory()/2560F;
		float ratioY=GuiTools.getYSizeInventory()/1440F;
		int xSlot;
		int ySlot;
		for(int k=0;k<6;k++)
		{
			xSlot=(1061 + k *(53+25));
			ySlot=606;
			xSlot=(int)(xSlot*ratioX);
			ySlot=(int)(ySlot*ratioY);
			System.out.println("xSlot:"+ratioX+" ySlot:"+ratioY);
			addSlot(new Slot(par1InventoryPlayer, k+9,xSlot, ySlot));
		}





        for (int l = 0; l < 8; l++)
        {
            addSlot(new Slot(par1InventoryPlayer, l, 8 + l * 18, 142));
        }

        onCraftMatrixChanged(craftMatrix);
    }

    /**
     * Callback for when the crafting matrix is changed.
     */
    public void onCraftMatrixChanged(IInventory par1IInventory)
    {
        craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(craftMatrix));
    }

    /**
     * Callback for when the crafting gui is closed.
     */
    public void onCraftGuiClosed(EntityPlayer par1EntityPlayer)
    {
        super.onCraftGuiClosed(par1EntityPlayer);

        for (int i = 0; i < 4; i++)
        {
            ItemStack itemstack = craftMatrix.getStackInSlotOnClosing(i);

            if (itemstack != null)
            {
                par1EntityPlayer.dropPlayerItem(itemstack);
            }
        }

        craftResult.setInventorySlotContents(0, null);
    }

    public boolean canInteractWith(EntityPlayer par1EntityPlayer)
    {
        return true;
    }

    /**
     * Called to transfer a stack from one inventory to the other eg. when shift clicking.
     * MODIF COntainerPlayer: transferStackInSlot(int par1)
     */
    public ItemStack transferStackInSlot(int par1)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)inventorySlots.get(par1);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par1 == 0)
            {
                if (!mergeItemStack(itemstack1, 9, 41, false))
                {
                    return null;
                }

                slot.func_48433_a(itemstack1, itemstack);
            }
            else if (par1 >= 9 && par1 < 32)
            {
                if (!mergeItemStack(itemstack1, 33, 41, false))
                {
                    return null;
                }
            }
            else if (par1 >= 32 && par1 < 41)
            {
                if (!mergeItemStack(itemstack1, 9, 32, false))
                {
                    return null;
                }
            }
            else if (!mergeItemStack(itemstack1, 9, 41, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack(null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize != itemstack.stackSize)
            {
                slot.onPickupFromSlot(itemstack1);
            }
            else
            {
                return null;
            }
        }

        return itemstack;
    }
}
