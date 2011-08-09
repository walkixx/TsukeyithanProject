
package Tsukeyithan.Player.Araoseth;

import java.util.Random;

import org.lwjgl.input.Mouse;

import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Achievement;
import net.minecraft.src.AchievementList;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityCrit2FX;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPickupFX;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.GuiBrewingStand;
import net.minecraft.src.GuiChest;
import net.minecraft.src.GuiCrafting;
import net.minecraft.src.GuiDispenser;
import net.minecraft.src.GuiEditSign;
import net.minecraft.src.GuiEnchantment;
import net.minecraft.src.GuiFurnace;
import net.minecraft.src.GuiWinGame;
import net.minecraft.src.IInventory;
import net.minecraft.src.Item;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MouseFilter;
import net.minecraft.src.MovementInput;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.Session;
import net.minecraft.src.StatBase;
import net.minecraft.src.TileEntityBrewingStand;
import net.minecraft.src.TileEntityDispenser;
import net.minecraft.src.TileEntityFurnace;
import net.minecraft.src.TileEntitySign;
import net.minecraft.src.World;

public class TKHEntityAraosethFemale extends EntityPlayerSP
{
	public TKHEntityAraosethFemale(Minecraft par1Minecraft, World par2World, Session par3Session, int par4) 
	{
		super(par1Minecraft, par2World, par3Session, par4);
        entityType = "Araoseth";
        entitySexe = "Female";
        texture = "/Tsukeyithan/Skin/AraosethFemale.png";
        speedOnGround = 0.1F*1.5F;
        speedInAir = 0.02F*1.5F;
        skinUrl = (new StringBuilder()).append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/").append(entityType).append("/").append(par3Session.username).append(".png").toString();
        speedOnGround = 0.1F*1.5F;
        speedInAir = 0.02F*1.5F;
		addSkillEffect(new TKHSkillEffect(TKHSkill.incJump.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.incCC.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.noSoulSand.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.noFallDmg.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.knockBack.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropApple.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropMush.skillID, -1, 0));
	}
	
	public void onUpdate() {
		super.onUpdate();

		if (this.mc.gameSettings.keyBindFPower.isPressed() && powerCD == 0
				&& !isSkillActive(TKHSkill.knockBack)) {
			addSkillEffect(new TKHSkillEffect(TKHSkill.knockBack.skillID, -1, 0));
			powerCD = 100;
		}
        
        if (this.mc.gameSettings.keyBindSPower.isPressed()) {
			if (isSkillActive(TKHSkill.incJump))
				removeSkillEffect(TKHSkill.incJump.skillID);
			else
				addSkillEffect(new TKHSkillEffect(TKHSkill.incJump.skillID, -1, 0));
		}
	}
	
	public int getMaxHealth()
    {    	
        return 40;
    }
}