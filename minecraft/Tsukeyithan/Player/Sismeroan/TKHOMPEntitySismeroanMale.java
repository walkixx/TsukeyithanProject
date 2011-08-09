
package Tsukeyithan.Player.Sismeroan;

import org.lwjgl.input.Mouse;

import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.World;


public class TKHOMPEntitySismeroanMale extends EntityOtherPlayerMP
{
	public TKHOMPEntitySismeroanMale(World par1World, String par2Str) 
	{
		super(par1World, par2Str);
		entityType = "Sismeroan";
		entitySexe = "Male";
		texture = "/Tsukeyithan/Skin/SismeroanMale.png";
		skinUrl = (new StringBuilder()).append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/").append(entityType).append("/").append(par2Str).append(".png").toString();
		this.foodStats.setFoodLevel(40);
        speedOnGround = 0.1F*0.7F;
        speedInAir = 0.02F*0.7F;
		addSkillEffect(new TKHSkillEffect(TKHSkill.climb.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.decFallDmg.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.silkTouch.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropMelon.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropPumkin.skillID, -1, 0));
	}

	public int getMaxHealth()
	{    	
		return 60;
	}
}