package Tsukeyithan.Player;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.Session;
import net.minecraft.src.World;

public class TKHCMPEntityHuman extends EntityClientPlayerMP
{

	public TKHCMPEntityHuman(Minecraft par1Minecraft, World par2World, Session par3Session, NetClientHandler par4NetClientHandler) 
	{
		super(par1Minecraft, par2World, par3Session, par4NetClientHandler);
		this.entityType = "Human";
		this.entitySexe = "Male";
		this.texture = "/mob/char.png";
		this.skinUrl = (new StringBuilder()).append("http://s3.amazonaws.com/MinecraftSkins/").append(par3Session.username).append(".png").toString();
	}

}