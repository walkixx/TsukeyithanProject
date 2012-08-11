
package Tsukeyithan.Player.Neerian;

import java.util.Random;

import org.lwjgl.input.Mouse;

import Tsukeyithan.Manager.TKHConfig;
import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EnchantmentHelper;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.Material;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;


public class TKHOMPEntityNeerianFemale extends EntityOtherPlayerMP
{
	public TKHOMPEntityNeerianFemale(World par1World, String par2Str) 
	{
		super(par1World, par2Str);
		entityType = "Neerian";
		entitySexe = "Female";
		texture = "/Tsukeyithan/Skin/NeerianFemale.png";
		skinUrl = (new StringBuilder())
				.append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/")
				.append(entityType).append("/").append(par2Str)
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
	}
	
	public int getMaxHealth() {
		return 40;
	}
}