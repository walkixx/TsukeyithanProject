
package Tsukeyithan.Player.Araoseth;

import java.util.Random;

import org.lwjgl.input.Mouse;

import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.Session;
import net.minecraft.src.World;

public class TKHEntityAraosethMale extends EntityPlayerSP
{
	public TKHEntityAraosethMale(Minecraft par1Minecraft, World par2World, Session par3Session, int par4) 
	{
		super(par1Minecraft, par2World, par3Session, par4);
        entityType = "Araoseth";
        entitySexe = "Male";
        texture = "/Tsukeyithan/Skin/AraosethMale.png";        
        skinUrl = (new StringBuilder()).append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/").append(entityType).append("/").append(par3Session.username).append(".png").toString();
        speedOnGround = 0.1F*1.5F;
        speedInAir = 0.02F*1.5F;
        addSkillEffect(new TKHSkillEffect(TKHSkill.isAraoseth.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.incCC.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.noSoulSand.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.noFallDmg.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.knockBack.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropApple.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropMush.skillID, -1, 0));
		this.maxPowerCD = 100;
	}
	
	public void onUpdate() {
		super.onUpdate();

		if (this.mc.gameSettings.keyBindFPower.isPressed() && powerCD > this.maxPowerCD) {
			addSkillEffect(new TKHSkillEffect(TKHSkill.knockBack.skillID, -1, 0));
			this.powerCD = 1;
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