
package Tsukeyithan.Player.Neerian;

import java.util.Random;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import Tsukeyithan.Manager.TKHConfig;
import Tsukeyithan.Manager.TKHPlayerManager;
import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.client.Minecraft;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EnchantmentHelper;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.KeyBinding;
import net.minecraft.src.Material;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.Session;
import net.minecraft.src.Tessellator;
import net.minecraft.src.World;

public class TKHEntityNeerianMale extends EntityPlayerSP {

	public TKHEntityNeerianMale(Minecraft par1Minecraft, World par2World,
			Session par3Session, int par4) {
		super(par1Minecraft, par2World, par3Session, par4);
		entityType = "Neerian";
		entitySexe = "Male";
		texture = "/Tsukeyithan/Skin/NeerianMale.png";
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