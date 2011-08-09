package Tsukeyithan.Manager;


import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayer;

public class TKHConfig {	
	public static Map RenderMap;
	public static Minecraft mc;
	public static float luminosity;
	public static boolean wasActive;
	public static int tkhversion = 0xA101;
	
	public static float GetLum(boolean test)
	{		
		if(test && luminosity<30)
		{
			wasActive = true;
			luminosity+=0.0001;
		}
		else if(!test && wasActive && luminosity > mc.gameSettings.gammaSetting)
			luminosity-=0.0001;
		else if(luminosity <= mc.gameSettings.gammaSetting)
		{
			wasActive = false;
			luminosity = mc.gameSettings.gammaSetting;
		}
		return luminosity;
	}
}
