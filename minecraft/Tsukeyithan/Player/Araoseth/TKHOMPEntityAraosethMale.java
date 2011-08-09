
package Tsukeyithan.Player.Araoseth;

import java.util.Random;

import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Potion;
import net.minecraft.src.World;


public class TKHOMPEntityAraosethMale extends EntityOtherPlayerMP
{
	public TKHOMPEntityAraosethMale(World par1World, String par2Str) 
	{
		super(par1World, par2Str);
        entityType = "Araoseth";
        entitySexe = "Male";
        texture = "/Tsukeyithan/Skin/AraosethMale.png";
        speedOnGround = 0.1F*1.5F;
        speedInAir = 0.02F*1.5F;
		skinUrl = (new StringBuilder()).append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/").append(entityType).append("/").append(par2Str).append(".png").toString();
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
	
	public int getMaxHealth()
    {    	
        return 40;
    }

}