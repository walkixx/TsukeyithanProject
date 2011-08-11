
package Tsukeyithan.Player.Neerian;

import java.util.Random;

import org.lwjgl.input.Mouse;

import Tsukeyithan.Manager.TKHConfig;
import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Achievement;
import net.minecraft.src.AchievementList;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.DamageSource;
import net.minecraft.src.EnchantmentHelper;
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
import net.minecraft.src.Material;
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

public class TKHEntityNeerianFemale extends EntityPlayerSP
{
	public TKHEntityNeerianFemale(Minecraft par1Minecraft, World par2World, Session par3Session, int par4) 
	{
		super(par1Minecraft, par2World, par3Session, par4);
		entityType = "Neerian";
		entitySexe = "Female";
		texture = "/Tsukeyithan/Skin/NeerianFemale.png";
		skinUrl = (new StringBuilder())
				.append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/")
				.append(entityType).append("/").append(par3Session.username)
				.append(".png").toString();
        addSkillEffect(new TKHSkillEffect(TKHSkill.isNeerian.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.speedWater.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.sprintWater.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.exacavationWater.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.airWater.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.doubleExp.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.imunPoison.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.aquaticVelocity.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropCrops.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropSC.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropTree.skillID, -1, 0));
		this.maxPowerCD = 600;
	}

	public void onUpdate() {
		super.onUpdate();

		if (this.mc.gameSettings.keyBindFPower.isPressed() && powerCD == this.maxPowerCD) {
			addSkillEffect(new TKHSkillEffect(TKHSkill.poisoning.skillID, -1, 0));
			this.powerCD = 1;
		}
        
        if (this.mc.gameSettings.keyBindSPower.isPressed()) {
			if (isSkillActive(TKHSkill.walkWater))
				removeSkillEffect(TKHSkill.walkWater.skillID);
			else
				addSkillEffect(new TKHSkillEffect(TKHSkill.walkWater.skillID, -1, 0));
		}
	}
	
	public int getMaxHealth() {
		return 40;
	}
}