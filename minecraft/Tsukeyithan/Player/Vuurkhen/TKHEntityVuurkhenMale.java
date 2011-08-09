
package Tsukeyithan.Player.Vuurkhen;

import java.util.Random;

import org.lwjgl.input.Mouse;

import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.client.Minecraft;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.Material;
import net.minecraft.src.Session;
import net.minecraft.src.World;

public class TKHEntityVuurkhenMale extends EntityPlayerSP {
	public TKHEntityVuurkhenMale(Minecraft par1Minecraft, World par2World,
			Session par3Session, int par4) {
		super(par1Minecraft, par2World, par3Session, par4);
		entityType = "Vuurkhen";
		entitySexe = "Male";
		texture = "/Tsukeyithan/Skin/VuurkhenMale.png";
		skinUrl = (new StringBuilder())
				.append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/")
				.append(entityType).append("/").append(par3Session.username)
				.append(".png").toString();
        speedOnGround = 0.1F*0.9F;
        speedInAir = 0.02F*0.9F;
		addSkillEffect(new TKHSkillEffect(TKHSkill.speedLava.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.sprintLava.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropMeat.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.doubleDamage.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.reductExplDmg.skillID, -1, 0));
		isImmuneToFire = true;
	}
	
	public void onUpdate() {
		super.onUpdate();

		if (this.mc.gameSettings.keyBindFPower.isPressed() && powerCD == 0
				&& !isSkillActive(TKHSkill.carbonization)) {
			addSkillEffect(new TKHSkillEffect(TKHSkill.carbonization.skillID, -1, 0));
			powerCD = 600;
		}
        
        if (this.mc.gameSettings.keyBindSPower.isPressed()) {
			if (isSkillActive(TKHSkill.walkLava))
				removeSkillEffect(TKHSkill.walkLava.skillID);
			else
				addSkillEffect(new TKHSkillEffect(TKHSkill.walkLava.skillID, -1, 0));
		}
	}
	
	public int getMaxHealth() {
		return 40;
	}
}