/** FILE ContainerPlayer **/
/** Fichier modifié ar chaipokoi**/
/** Notes:
 * Mesures utiles pour plus tard:
 * 32px minecraft = 65px réels (largeur)
 * 46px minecraft = 93px réels (hauteur)
**/ 
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

     //affichage des slots de crafting
        addSlot(new SlotCrafting(par1InventoryPlayer.player, craftMatrix, craftResult, 0, getCustomXPos(212),getCustomYPos(52)));
        addSlot(new Slot(craftMatrix, 0,getCustomXPos(118) ,getCustomYPos(33) ));
        addSlot(new Slot(craftMatrix, 1,getCustomXPos(153) ,getCustomYPos(33) ));
        addSlot(new Slot(craftMatrix, 2,getCustomXPos(118) ,getCustomYPos(68) ));
        addSlot(new Slot(craftMatrix, 3,getCustomXPos(153) ,getCustomYPos(68) ));
        
	//affichage des slots d'équipement 

            addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - 0, getCustomXPos(102), getCustomXPos(-41) , 0));
			addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - 1, getCustomXPos(139), getCustomXPos(-34) , 1));
			addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - 2, getCustomXPos(185), getCustomXPos(-34) , 2));
			addSlot(new SlotArmor(this, par1InventoryPlayer, par1InventoryPlayer.getSizeInventory() - 1 - 3, getCustomXPos(223), getCustomXPos(-41) , 3));

	//affichage des slots de l'inventaire
		//première ligne 
		for(int k=0;k<6;k++)
		{
			addSlot(new Slot(par1InventoryPlayer, k+8,37+k*17, 56));
		}
		//seconde ligne 
		for(int k1=0;k1<5;k1++)
		{
			addSlot(new Slot(par1InventoryPlayer, k1+14,(getCustomXPos(91)+2)+k1*17, getCustomYPos(145)+1));
		}
		//troisème ligne 
		for(int k2=0;k2<4;k2++)
		{
			addSlot(new Slot(par1InventoryPlayer, k2+19,(getCustomXPos(109)+1)+k2*17, getCustomYPos(180)+1));
		}
		//dernière ligne 
		for(int k3=0;k3<3;k3++)
		{
			addSlot(new Slot(par1InventoryPlayer, k3+23,getCustomXPos(126)+k3*17, getCustomYPos(216)+1));
		}
		
		//ajout des slots main gauche
		addSlot(new Slot(par1InventoryPlayer, 0,getCustomXPos(15)-18, getCustomYPos(80)));
		addSlot(new Slot(par1InventoryPlayer, 1,getCustomXPos(31)-18, getCustomYPos(123)+1));
		addSlot(new Slot(par1InventoryPlayer, 2,getCustomXPos(20), getCustomYPos(167)+1));
		addSlot(new Slot(par1InventoryPlayer, 3,getCustomXPos(47), getCustomYPos(205)+1));

		//ajout des slots main droite
		addSlot(new Slot(par1InventoryPlayer, 4,getCustomXPos(277), getCustomYPos(205)+1));
		addSlot(new Slot(par1InventoryPlayer, 5,getCustomXPos(305), getCustomYPos(167)+1));
		addSlot(new Slot(par1InventoryPlayer, 6,getCustomXPos(328)+1, getCustomYPos(124)));
		addSlot(new Slot(par1InventoryPlayer, 7,getCustomXPos(347), getCustomYPos(80)+1));

        onCraftMatrixChanged(craftMatrix);
    }
    
    /**
     * return the Gui x Pos for a real pixel x Pos
     */
    private int getCustomXPos(int value)
    {
		return (int)(32*value/65);
	}
	
    /**
     * return the Gui y Pos for a real pixel y Pos
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
