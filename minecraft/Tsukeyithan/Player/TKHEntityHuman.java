
package Tsukeyithan.Player;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.Session;
import net.minecraft.src.World;

public class TKHEntityHuman extends EntityPlayerSP
{
	public TKHEntityHuman(Minecraft par1Minecraft, World par2World, Session par3Session, int par4) 
	{
		super(par1Minecraft, par2World, par3Session, par4);
		this.entityType = "Human";
		this.entitySexe = "Male";
		this.texture = "/mob/char.png";
		this.skinUrl = (new StringBuilder()).append("http://s3.amazonaws.com/MinecraftSkins/").append(par3Session.username).append(".png").toString();
	}
}