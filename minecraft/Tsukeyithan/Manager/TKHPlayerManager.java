
package Tsukeyithan.Manager;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.Session;
import net.minecraft.src.World;
import Tsukeyithan.Player.Araoseth.TKHCMPEntityAraosethFemale;
import Tsukeyithan.Player.Araoseth.TKHCMPEntityAraosethMale;
import Tsukeyithan.Player.Araoseth.TKHEntityAraosethFemale;
import Tsukeyithan.Player.Araoseth.TKHEntityAraosethMale;
import Tsukeyithan.Player.Araoseth.TKHOMPEntityAraosethFemale;
import Tsukeyithan.Player.Araoseth.TKHOMPEntityAraosethMale;
import Tsukeyithan.Player.Neerian.*;
import Tsukeyithan.Player.Sismeroan.TKHCMPEntitySismeroanFemale;
import Tsukeyithan.Player.Sismeroan.TKHCMPEntitySismeroanMale;
import Tsukeyithan.Player.Sismeroan.TKHEntitySismeroanFemale;
import Tsukeyithan.Player.Sismeroan.TKHEntitySismeroanMale;
import Tsukeyithan.Player.Sismeroan.TKHOMPEntitySismeroanFemale;
import Tsukeyithan.Player.Sismeroan.TKHOMPEntitySismeroanMale;
import Tsukeyithan.Player.Vuurkhen.TKHCMPEntityVuurkhenFemale;
import Tsukeyithan.Player.Vuurkhen.TKHCMPEntityVuurkhenMale;
import Tsukeyithan.Player.Vuurkhen.TKHEntityVuurkhenFemale;
import Tsukeyithan.Player.Vuurkhen.TKHEntityVuurkhenMale;
import Tsukeyithan.Player.Vuurkhen.TKHOMPEntityVuurkhenFemale;
import Tsukeyithan.Player.Vuurkhen.TKHOMPEntityVuurkhenMale;
import Tsukeyithan.Player.*;

public class TKHPlayerManager
{
	//private static HashMap <String, Boolean> liste = new HashMap<String, Boolean>();
	private static HashMap <String, HashMap<String, Boolean>> player = new HashMap<String, HashMap<String, Boolean>>();
	byte i;

	public TKHPlayerManager()
	{		
	}
	
	public static EntityOtherPlayerMP GetEntityPlayer(World world, String username)	
	{
		if(player.containsKey(username)) 
		{ 
			if(player.get(username).containsKey("male"))
			{
				if(player.get(username).containsKey("neerian"))
	        		return new TKHOMPEntityNeerianMale(world, username);
				else if(player.get(username).containsKey("vuurkhen"))
	        		return new TKHOMPEntityVuurkhenMale(world, username);
				else if(player.get(username).containsKey("araoseth"))
	        		return new TKHOMPEntityAraosethMale(world, username);
				else if(player.get(username).containsKey("sismeroan"))
	        		return new TKHOMPEntitySismeroanMale(world, username);
			}
			else if(player.get(username).containsKey("female"))
			{
				if(player.get(username).containsKey("neerian"))
	        		return new TKHOMPEntityNeerianFemale(world, username);
				else if(player.get(username).containsKey("vuurkhen"))
		        		return new TKHOMPEntityVuurkhenFemale(world, username);
				else if(player.get(username).containsKey("araoseth"))
			        		return new TKHOMPEntityAraosethFemale(world, username);
				else if(player.get(username).containsKey("sismeroan"))
	        		return new TKHOMPEntitySismeroanFemale(world, username);
			}
		}
		
		return new TKHOMPEntityHuman(world, username);
	}
	
	public static EntityPlayer GetEntityPlayer(Minecraft mc, World par1World, Session session, NetClientHandler netclienthandler)	
	{
		if(player.containsKey(session.username)) 
		{ 
			if(player.get(session.username).containsKey("male"))
			{
				if(player.get(session.username).containsKey("neerian"))
	        		return new TKHCMPEntityNeerianMale(mc, par1World, session, netclienthandler);
				else if(player.get(session.username).containsKey("vuurkhen"))
	        		return new TKHCMPEntityVuurkhenMale(mc, par1World, session, netclienthandler);
				else if(player.get(session.username).containsKey("araoseth"))
	        		return new TKHCMPEntityAraosethMale(mc, par1World, session, netclienthandler);
				else if(player.get(session.username).containsKey("sismeroan"))
	        		return new TKHCMPEntitySismeroanMale(mc, par1World, session, netclienthandler);
			}
			else if(player.get(session.username).containsKey("female"))
			{
				if(player.get(session.username).containsKey("neerian"))
	        		return new TKHCMPEntityNeerianFemale(mc, par1World, session, netclienthandler);
				else if(player.get(session.username).containsKey("vuurkhen"))
	        		return new TKHCMPEntityVuurkhenFemale(mc, par1World, session, netclienthandler);
				else if(player.get(session.username).containsKey("araoseth"))
	        		return new TKHCMPEntityAraosethFemale(mc, par1World, session, netclienthandler);
				else if(player.get(session.username).containsKey("sismeroan"))
	        		return new TKHCMPEntitySismeroanFemale(mc, par1World, session, netclienthandler);
			}
		}
		
		return new TKHCMPEntityHuman(mc, par1World, session, netclienthandler);
	}
	
	public static EntityPlayer GetEntityPlayer(Minecraft mc, World par1World, Session session, int worldType)	
	{		
		if(player.containsKey(session.username)) 
		{ 
			if(player.get(session.username).containsKey("male"))
			{
				if(player.get(session.username).containsKey("neerian"))
	        		return new TKHEntityNeerianMale(mc, par1World, session, worldType);
				else if(player.get(session.username).containsKey("vuurkhen"))
	        		return new TKHEntityVuurkhenMale(mc, par1World, session, worldType);
				else if(player.get(session.username).containsKey("araoseth"))
	        		return new TKHEntityAraosethMale(mc, par1World, session, worldType);
				else if(player.get(session.username).containsKey("sismeroan"))
	        		return new TKHEntitySismeroanMale(mc, par1World, session, worldType);
			}
			else if(player.get(session.username).containsKey("female"))
			{
				if(player.get(session.username).containsKey("neerian"))
	        		return new TKHEntityNeerianFemale(mc, par1World, session, worldType);
				else if(player.get(session.username).containsKey("vuurkhen"))
	        		return new TKHEntityVuurkhenFemale(mc, par1World, session, worldType);
				else if(player.get(session.username).containsKey("araoseth"))
	        		return new TKHEntityAraosethFemale(mc, par1World, session, worldType);
				else if(player.get(session.username).containsKey("sismeroan"))
	        		return new TKHEntitySismeroanFemale(mc, par1World, session, worldType);
			}
		}
		
		//return new TKHEntityHuman(mc, par1World, session, worldType); (test de collision)
		return new TKHEntitySismeroanMale(mc, par1World, session, worldType);
	}
	
	public static boolean GetPlayerProp(String prop)
	{
		if(player.containsKey(TKHConfig.mc.session.username) && player.get(TKHConfig.mc.session.username).containsKey(prop))
			return true;
		return false;
	}
	
	public static void UpdatePlayer()
	{	
		System.out.print("[TKH]Updating Player List...");
		URL u ; 
		DataInputStream dis ; 
		try 
		{
			u = new URL("http://walkixx.com/Minecraft/Tsukeyithan/liste.plr");
			 
			dis = new DataInputStream(u.openStream());
			String ligne;
			while((ligne = dis.readLine()) != null)
			{
				char carac;
				String word = "", name="";
				byte j=0;
				for(byte i=0;i<ligne.length();i++)
				{
					carac = ligne.charAt(i);
					if(carac != ';')
					{
						word += carac;
					}
					else if(j==0)
					{
						name = word;
						player.put(name, new HashMap<String, Boolean>());
						System.out.print("\n" + word + ";");
						word = "";
						j++;
					}
					else
					{
						player.get(name).put(word, true);
						System.out.print(word + ";");
						word = "";
					}
				}
			}

			System.out.println("\n[TKH]Updating Finish With Success.");
		} 
		catch (IOException e) 
		{ 
			e.getStackTrace();
		} 
	}
}
