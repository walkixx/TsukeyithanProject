
package Tsukeyithan.Player.Sismeroan;

import org.lwjgl.input.Mouse;

import Tsukeyithan.Packet.Packet136AddSkillEffect;
import Tsukeyithan.Skill.TKHSkill;
import Tsukeyithan.Skill.TKHSkillEffect;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.Session;
import net.minecraft.src.World;

public class TKHCMPEntitySismeroanMale extends EntityClientPlayerMP
{
	public TKHCMPEntitySismeroanMale(Minecraft par1Minecraft, World par2World, Session par3Session, NetClientHandler par4NetClientHandler) 
	{
		super(par1Minecraft, par2World, par3Session, par4NetClientHandler);
		entityType = "Sismeroan";
		entitySexe = "Male";
		texture = "/Tsukeyithan/Skin/SismeroanMale.png";
		skinUrl = (new StringBuilder()).append("http://walkixx.com/Minecraft/Tsukeyithan/Skin/").append(entityType).append("/").append(par3Session.username).append(".png").toString();
		this.foodStats.setFoodLevel(40);
        speedOnGround = 0.1F*0.7F;
        speedInAir = 0.02F*0.7F;
        addSkillEffect(new TKHSkillEffect(TKHSkill.isSismeroan.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.climb.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.decFallDmg.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.silkTouch.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropMelon.skillID, -1, 0));
		addSkillEffect(new TKHSkillEffect(TKHSkill.dropPumkin.skillID, -1, 0));
		this.maxPowerCD = 600;
	}
	
	public void onUpdate() {
		super.onUpdate();

		if (this.mc.gameSettings.keyBindFPower.isPressed() && powerCD == this.maxPowerCD) {
			this.mc.getSendQueue().addToSendQueue(new Packet136AddSkillEffect(this.entityId, TKHSkill.stun.skillID, 200));
			this.mc.getSendQueue().addToSendQueue(new Packet136AddSkillEffect(this.entityId, TKHSkill.invisibility.skillID, 200));
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