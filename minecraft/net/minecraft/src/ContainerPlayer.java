/** FILE ContainerPlayer **/
/** Fichier modifié par chaipokoi le 11/08/2012**/
/** Notes:
 * Mesures utiles pour plus tard:
 * 32px minecraft = 65px réels (largeur)
 * 46px minecraft = 93px réels (hauteur)
**/ 

package net.minecraft.src;

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

     //affichage des slots de crafting
        addSlot(new SlotCrafting(par1InventoryPlayer.player, craftMatrix, craftResult, 0, getCustomXPos(220),getCustomYPos(57)));
        addSlot(new Slot(craftMatrix, 0,getCustomXPos(125) ,getCustomYPos(40) ));
        addSlot(new Slot(craftMatrix, 1,getCustomXPos(161) ,getCustomYPos(40) ));
        addSlot(new Slot(craftMatrix, 2,getCustomXPos(125) ,getCustomYPos(75) ));
        addSlot(new Slot(craftMatrix, 3,getCustomXPos(161) ,getCustomYPos(75) ));
        
	//affichage des slots d'équipement 

            addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - 0, getCustomXPos(109), getCustomXPos(-39) , 0));
			addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - 1, getCustomXPos(147), getCustomXPos(-31) , 1));
			addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - 2, getCustomXPos(192), getCustomXPos(-31) , 2));
			addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - 3, getCustomXPos(232)-1, getCustomXPos(-39) , 3));

	//affichage des slots de l'inventaire
		//première ligne 
		addSlot(new Slot(par1InventoryPlayer, 8,getCustomXPos(78), getCustomYPos(116)));
		addSlot(new Slot(par1InventoryPlayer, 9,getCustomXPos(112), getCustomYPos(116)));
		addSlot(new Slot(par1InventoryPlayer, 10,getCustomXPos(148), getCustomYPos(116)));
		addSlot(new Slot(par1InventoryPlayer, 11,getCustomXPos(183), getCustomYPos(116)));
		addSlot(new Slot(par1InventoryPlayer, 12,getCustomXPos(218), getCustomYPos(116)));
		addSlot(new Slot(par1InventoryPlayer, 13,getCustomXPos(254), getCustomYPos(116)));
		//seconde ligne 
		addSlot(new Slot(par1InventoryPlayer, 14,getCustomXPos(97), getCustomYPos(152)));
		addSlot(new Slot(par1InventoryPlayer, 15,getCustomXPos(131), getCustomYPos(152)));
		addSlot(new Slot(par1InventoryPlayer, 16,getCustomXPos(167), getCustomYPos(152)));
		addSlot(new Slot(par1InventoryPlayer, 17,getCustomXPos(202), getCustomYPos(152)));
		addSlot(new Slot(par1InventoryPlayer, 18,getCustomXPos(236), getCustomYPos(152)));
		//troisème ligne 
		addSlot(new Slot(par1InventoryPlayer, 19,getCustomXPos(114), getCustomYPos(186)));
		addSlot(new Slot(par1InventoryPlayer, 20,getCustomXPos(149), getCustomYPos(186)));
		addSlot(new Slot(par1InventoryPlayer, 21,getCustomXPos(183), getCustomYPos(186)));
		addSlot(new Slot(par1InventoryPlayer, 22,getCustomXPos(220), getCustomYPos(186)));
		//dernière ligne 
		addSlot(new Slot(par1InventoryPlayer, 23,getCustomXPos(132), getCustomYPos(223)));
		addSlot(new Slot(par1InventoryPlayer, 24,getCustomXPos(167), getCustomYPos(223)));
		addSlot(new Slot(par1InventoryPlayer, 25,getCustomXPos(203), getCustomYPos(223)));
		
		//ajout des slots main gauche
		addSlot(new Slot(par1InventoryPlayer, 0,getCustomXPos(-19), getCustomYPos(84)));
		addSlot(new Slot(par1InventoryPlayer, 1,getCustomXPos(-3), getCustomYPos(130)));
		addSlot(new Slot(par1InventoryPlayer, 2,getCustomXPos(23), getCustomYPos(173)));
		addSlot(new Slot(par1InventoryPlayer, 3,getCustomXPos(51), getCustomYPos(211)));

		//ajout des slots main droite
		addSlot(new Slot(par1InventoryPlayer, 4,getCustomXPos(281), getCustomYPos(212)));
		addSlot(new Slot(par1InventoryPlayer, 5,getCustomXPos(309), getCustomYPos(172)));
		addSlot(new Slot(par1InventoryPlayer, 6,getCustomXPos(335), getCustomYPos(130)));
		addSlot(new Slot(par1InventoryPlayer, 7,getCustomXPos(351), getCustomYPos(85)));

        onCraftMatrixChanged(craftMatrix);
    }
    
    /**
     * return the Gui x Pos for a real pixel x Pos (tsukeyithan)
     */
    private int getCustomXPos(int value)
    {
		return (int)(32*value/65);
	}
	
    /**
     * return the Gui y Pos for a real pixel y Pos (tsukeyithan)
     */
    private int getCustomYPos(int value)
    {
		return (int)(46*value/93);
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
