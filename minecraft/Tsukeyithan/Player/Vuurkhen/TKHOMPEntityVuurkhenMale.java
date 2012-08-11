
package Tsukeyithan.Player.Vuurkhen;

import java.util.Random;

import org.lwjgl.input.Mouse;

import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class TKHOMPEntityVuurkhenMale extends EntityOtherPlayerMP {

	public TKHOMPEntityVuurkhenMale(World par1World, String par2Str) {
		super(par1World, par2Str);
		entityType = "Vuurkhen";
		entitySexe = "Male";
		texture = "/Tsukeyithan/Skin/VuurkhenMale.png";
		skinUrl = (new StringBuilder())
				.append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/")
				.append(entityType).append("/").append(par2Str).append(".png")
				.toString();
        speedOnGround = 0.1F*0.9F;
        speedInAir = 0.02F*0.9F;
        addSkillEffect(new TKHSkillEffect(TKHSkill.isVuurkhen.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.speedLava.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.sprintLava.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropMeat.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.doubleDamage.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.reductExplDmg.skillID, -1, 0));
		isImmuneToFire = true;
	}

	public int getMaxHealth() {
		return 40;
	}

}