
package Tsukeyithan.Player.Sismeroan;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import Tsukeyithan.Manager.TKHPlayerManager;
import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.client.Minecraft;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.Session;
import net.minecraft.src.Tessellator;
import net.minecraft.src.World;

public class TKHEntitySismeroanMale extends EntityPlayerSP
{
	public TKHEntitySismeroanMale(Minecraft par1Minecraft, World par2World, Session par3Session, int par4) 
	{
		super(par1Minecraft, par2World, par3Session, par4);
        entityType = "Sismeroan";
        entitySexe = "Male";
        texture = "/Tsukeyithan/Skin/SismeroanMale.png";
        skinUrl = (new StringBuilder()).append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/").append(entityType).append("/").append(par3Session.username).append(".png").toString();
        this.foodStats.setFoodLevel(40);
        speedOnGround = 0.1F*0.7F;
        speedInAir = 0.02F*0.7F;
        addSkillEffect(new TKHSkillEffect(TKHSkill.climb.skillID, -1, 0));
        addSkillEffect(new TKHSkillEffect(TKHSkill.decFallDmg.skillID, -1, 0));
        addSkillEffect(new TKHSkillEffect(TKHSkill.silkTouch.skillID, -1, 0));
        addSkillEffect(new TKHSkillEffect(TKHSkill.dropMelon.skillID, -1, 0));
        addSkillEffect(new TKHSkillEffect(TKHSkill.dropPumkin.skillID, -1, 0));
        this.maxPowerCD = 600;
	}
	
	public void onUpdate() {
		super.onUpdate();
        System.out.println(this.boundingBox.maxY-this.boundingBox.minY);
		if(isSneaking())
		{
			this.boundingBox.maxY = this.boundingBox.minY+1.9;
		}
		else
		{
			this.boundingBox.maxY = this.boundingBox.minY+2+(2*0.166666);
		}
		
		if (this.mc.gameSettings.keyBindFPower.isPressed() && powerCD == this.maxPowerCD) {
			addSkillEffect(new TKHSkillEffect(TKHSkill.stun.skillID, 200, 0));
			addSkillEffect(new TKHSkillEffect(TKHSkill.invisibility.skillID, 200, 0));
			this.powerCD = 1;
		}
        
        if (this.mc.gameSettings.keyBindSPower.isPressed()) {
			if (isSkillActive(TKHSkill.nightvision))
				removeSkillEffect(TKHSkill.nightvision.skillID);
			else
				addSkillEffect(new TKHSkillEffect(TKHSkill.nightvision.skillID, -1, 0));
		}


        if (movementInput.sneak && ySize < 0.2F || this.worldObj.getBlockMaterial((int)this.posX-1, (int)this.posY+1, (int)this.posZ-1).isSolid())
        {
            ySize = 0.2F;
        }
	}
	
	public boolean isSneaking()
    {    	
        return (movementInput.sneak && !sleeping) || (this.worldObj.getBlockMaterial((int)this.posX-1, (int)this.posY+1, (int)this.posZ-1).isSolid());
    }
	
	public int getMaxHealth()
    {    	
        return 60;
    }
}
