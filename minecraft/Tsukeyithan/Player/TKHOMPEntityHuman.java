
package Tsukeyithan.Player;

import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.World;


public class TKHOMPEntityHuman extends EntityOtherPlayerMP
{

	public TKHOMPEntityHuman(World par1World, String par2Str) 
	{
		super(par1World, par2Str);
		this.entityType = "Human";
		this.entitySexe = "Male";
		this.texture = "/mob/char.png";
		this.skinUrl = (new StringBuilder()).append("http://s3.amazonaws.com/MinecraftSkins/").append(par2Str).append(".png").toString();
	}

}