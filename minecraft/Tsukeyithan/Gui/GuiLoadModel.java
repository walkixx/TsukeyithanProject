package Tsukeyithan.Gui;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import Tsukeyithan.Manager.TKHConfig;

import net.minecraft.src.Entity;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.GuiSmallButton;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelBiped;
import net.minecraft.src.Render;
import net.minecraft.src.RenderLiving;

public class GuiLoadModel extends GuiScreen {
	public List renderList;
	public Map renderToSkin;
	public List nameList;

	public GuiLoadModel() {
		super();
		renderToSkin = new HashMap();
		nameList = new ArrayList();
		renderList = new ArrayList();
	}

	public void initGui() {
		this.controlList.clear();
		GetSkin();
		GetEntity();
	}

	public void updateScreen() {
	}

	public void drawScreen(int par1, int par2, float par3) {
		DrawBackground();
		super.drawScreen(par1, par2, par3);
	}

	/** BACKGROUND **/
	public void DrawBackground() {
		drawGradientRect(0, 0, this.width, this.height, 0xFF5A5A5A, 0xFF5A5A5A);
		drawGradientRect(2, 2, this.width - 2, this.height - 2, 0xFF3B3B3B,
				0xFF3B3B3B);
	}

	protected void actionPerformed(GuiButton guibutton) {
		System.out.println();
		this.mc.displayGuiScreen(new GuiSkinEditor(((RenderLiving)renderList.get(guibutton.id)).mainModel, (String)renderToSkin.get(nameList.get(guibutton.id))));
	}

	public void GetSkin() {
		URL u ; 
		DataInputStream dis ; 
		try 
		{
			u = new URL("http://walkixx.com/Minecraft/Tsukeyithan/RenderToSkin.rts"); 
			dis = new DataInputStream(u.openStream()); 
			String ligne;
			while((ligne = dis.readLine()) != null)
			{
				String render = "", word = "";
				for(byte i=0;i<ligne.length();i++)
				{
					if(ligne.charAt(i) == '=')
					{
						render = word;
						word = "";
					}
					else
						word += ligne.charAt(i);
				}
				renderToSkin.put(render, word);
			}
		} 
		catch (Exception e) 
		{ 
			e.getStackTrace();
		} 
	}

	public void GetEntity() {
		int id = 0, x = 0, y = 0;
		Render render;
		for (Iterator iterator = TKHConfig.RenderMap.values().iterator(); iterator
				.hasNext();) {
			render = (Render) iterator.next();

			if (render instanceof RenderLiving) {
				String name = render.toString();
				String tempMot = "";
				char carac;

				for (byte i = 0; i < name.length(); i++) {
					carac = name.charAt(i);
					if (carac != '.' && carac != '@')
						tempMot += carac;
					else if (carac == '.')
						tempMot = "";
					else if (carac == '@')
						break;
				}
				name = tempMot;
				
				nameList.add(id, name);
				renderList.add(id, (RenderLiving) render);
				
				if (y >= 20) {
					y = 0;
					x++;
				}

				controlList.add(new GuiSmallButton(id++, x * 152 + 2, ++y * 22,
						name));
			}
		}
	}
}
