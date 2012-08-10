package Tsukeyithan.Gui;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.IntBuffer;

import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import Tsukeyithan.Manager.TKHPlayerManager;
import Tsukeyithan.Player.Neerian.TKHCMPEntityNeerianMale;
import Tsukeyithan.Player.Neerian.TKHModelNeerianMale;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GLAllocation;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelBiped;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.Tessellator;

public class GuiSkinEditor extends GuiScreen
{
	public ScaledResolution scaledresolution;
	public Vector3f rotModel;
	public ModelBase model;
	public float motionSensitivity;
	public float scrollSensitivity;
	private float zoom;	
	public static BufferedImage skin;
	public IntBuffer ib;
	public int tempColor;
	public static int BIColor;
	public byte size;
	public GuiButton toolBar[];
	public boolean drawwer;
	public String skinUrl;
	public EntityLiving player;

	public GuiSkinEditor(ModelBase modelbase, String skin)
	{
		super();
		this.skinUrl = skin;
		this.model = modelbase;
		this.rotModel = new Vector3f(180,180,0);
		this.motionSensitivity = 1F;
		this.scrollSensitivity = 1F;
		this.zoom = 1F;
		this.ib = GLAllocation.createDirectIntBuffer(1);
		this.BIColor = 0xFFFFFFFF;
		this.drawwer = true;
	}

	public void initGui()
	{
		this.controlList.clear();
		this.scaledresolution = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
		try {
			System.out.println("SkinUrl:"+skinUrl);
			skin = ImageIO.read(this.mc.texturePackList.selectedTexturePack.getResourceAsStream(skinUrl));
		} catch (IOException e) {	e.printStackTrace();	}
		DrawMenuBar();
		DrawToolBar();
		toolBar[0].enabled = false;
	}

	public void updateScreen()
	{
		boolean flagModel = GetMousePos().x > this.width/2 && GetMousePos().x < this.width-4 
				&& GetMousePos().y > 22 && GetMousePos().y <  this.height-4;
				if(flagModel)
				{
					if(Mouse.hasWheel())
						zoom += Mouse.getDWheel()/100;
					if(zoom <= 0)
						zoom = 1F;
					else if(zoom >= 8)
						zoom = 7F;
					if(Mouse.isButtonDown(0) || Mouse.isButtonDown(1))
					{
						rotModel.x -= Mouse.getDY()*motionSensitivity;
						rotModel.y -= Mouse.getDX()*motionSensitivity;
					}
				}
				
				if(!toolBar[1].enabled)
					this.tempColor = this.BIColor = GetPixelColor();
				else if(!toolBar[3].enabled)
					opacity();
				else if(this.drawwer)
					this.skin = EditImage(this.skin);
	}

	private Vector2f GetMousePos()
	{
		int i = this.scaledresolution.getScaledWidth();
		int j = this.scaledresolution.getScaledHeight();
		int x = (Mouse.getX() * i) / this.mc.displayWidth;
		int y = j - (Mouse.getY() * j) / this.mc.displayHeight - 1;
		return new Vector2f(x, y);
	}

	public void drawScreen(int par1, int par2, float par3)
	{
		DrawBackground();
		DrawModel(this.rotModel.x, this.rotModel.y, this.rotModel.z);
		DrawPatron();
		super.drawScreen(par1, par2, par3);
	}

	/** BACKGROUND **/
	public void DrawBackground()
	{
		drawGradientRect(0, 0, this.width, this.height, 0xFF5A5A5A, 0xFF5A5A5A);
		drawGradientRect(2, 2, this.width-2, this.height-2, 0xFF3B3B3B, 0xFF3B3B3B);
	}

	/** MENUBAR **/
	public void DrawMenuBar(){	
		controlList.add(new GuiButton(0x1, 4,4, 32, 12, "New"));	
		controlList.add(new GuiButton(0x2, 38,4, 32, 12, "Load"));	
		controlList.add(new GuiButton(0x3, 72,4, 32, 12, "Save"));
	}

	/** TOOLBAR **/
	public void DrawToolBar(){
		toolBar = new GuiButton[4];	
		controlList.add(new GuiButton(0x11, 4,20, 70,12, "Select Color"));
		controlList.add(toolBar[1] = new GuiButton(0x12, 76,20, 40,12, "Pipette"));	
		controlList.add(toolBar[0] = new GuiButton(0x10, 118,20, 32,12, "Draw"));
		controlList.add(toolBar[2] = new GuiButton(0x13, 152,20, 45,12, "Rubber"));
		controlList.add(toolBar[3] = new GuiButton(0x14, 199,20, 40,12, "Opacity"));	
	}

	/** MODEL **/
	public void DrawModel(float x, float y, float z){		
		GL11.glPushMatrix();	
		GL11.glColor4f(1F, 1F, 1F, 1F);
		drawGradientRect(this.width/2+1, 22, this.width-4, this.height-4, 0xFF5A5A5A, 0xFF5A5A5A);
		GL11.glTranslatef((int)(((this.width-4)-this.width/2)*1.5), (this.height-26)/2 , 500);
		GL11.glRotatef(-x, 1, 0, 0);GL11.glRotatef(y, 0, 1, 0);GL11.glRotatef(z, 0, 0, 1);
		GL11.glScalef(zoom/4, zoom/4, zoom/4);
		this.mc.renderEngine.bindTexture(GetTexture());
		this.model.render(null, 1F, 0F, 0F, 0F, 0F, -6);
		GL11.glPopMatrix();
	}

	/** PATRON **/
	public void DrawPatron()
	{
		this.mc.renderEngine.bindTexture(GetTexture());
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(4, this.height/2, 10, 0, 0);
		tessellator.addVertexWithUV(4, this.height-4, 10, 0, 1);
		tessellator.addVertexWithUV((this.width/2), this.height-4, 10, 1, 1);
		tessellator.addVertexWithUV((this.width/2), this.height/2, 10, 1, 0);
		tessellator.draw();
		//mc.currentScreen.drawRect((int)this.position.x, (int)this.position.y, (int)(this.position.x + this.size.x), (int)(this.position.y + this.size.y), 0x7f000000);
		mc.currentScreen.drawRect(4, this.height/2, (this.width/2) , this.height-4, 0xFF5A5A5A);
		mc.currentScreen.drawRect(16, 40, (this.width/2)-16 , this.height/2-4, this.BIColor);
	}
		
	/** TOOLS **/
	
	protected void actionPerformed(GuiButton guibutton)
    {
		if(guibutton.id == 0x1)
		{
			this.mc.displayGuiScreen(new GuiLoadModel());
		}
		if(guibutton.id == 0x2)
		{
			LoadFileChooser fc = new LoadFileChooser();
			SwingUtilities.invokeLater(fc);
		}
		if(guibutton.id == 0x3)
		{
			SaveFileChooser fc = new SaveFileChooser(this.skin);
			SwingUtilities.invokeLater(fc);
		}
		
		if(guibutton.id == 0x10)
		{
			this.BIColor = 0xFFFFFFFF;
		}
		
		if(guibutton.id == 0x11)
		{
			ColorChooser cc = new ColorChooser();
			SwingUtilities.invokeLater(cc);
		}
		
		
		if(guibutton.equals(toolBar[0]))
		{
			this.BIColor = this.tempColor;
			this.drawwer = true;
			for(byte i=0;i<toolBar.length;i++)
				if(!toolBar[i].enabled)
					toolBar[i].enabled = true;	
			guibutton.enabled = false;
		}
		else if(guibutton.equals(toolBar[1]))
		{
			this.drawwer = false;
			for(byte i=0;i<toolBar.length;i++)
				if(!toolBar[i].enabled)
					toolBar[i].enabled = true;
			guibutton.enabled = false;;
		}
		else if(guibutton.equals(toolBar[2]))
		{
			this.drawwer = true;
			for(byte i=0;i<toolBar.length;i++)
				if(!toolBar[i].enabled)
					toolBar[i].enabled = true;			
			guibutton.enabled = false;
			
			this.tempColor = this.BIColor;
			this.BIColor = 0xFFFFFFFF;
		}
		else if(guibutton.equals(toolBar[3]))
		{
			this.drawwer = true;
			for(byte i=0;i<toolBar.length;i++)
				if(!toolBar[i].enabled)
					toolBar[i].enabled = true;			
			guibutton.enabled = false;

			this.tempColor = this.BIColor;
			this.BIColor = 0xFFFFFFFF;
		}
    }
	
	public void opacity()
	{
		boolean flag = GetMousePos().x > 4 && GetMousePos().x < (this.width/2) 
				&& GetMousePos().y > this.height/2 && GetMousePos().y <  this.height-4;
		if(flag & Mouse.isButtonDown(0))
		{
			float[] color = new float[5];
			int couleur = GetPixelColor();
			color[0] = ((couleur >> 24) & 0xFF)+1;
			color[1] = ((couleur >> 16) & 0x00FF)+1;
			color[2] = ((couleur >> 8) & 0x0000FF)+1;
			color[3] = (couleur & 0x00FF)+1;
			color[4] = (((color[1]/256)+(color[2]/256)+(color[3]/256))/3)*100;
			System.out.println(color[0] + " " + color[1] + " " + color[2] + " " + color[3] + " " + color[4]);
			this.skin.setRGB((int)((GetMousePos().x-4)/((this.width/2F-4F)/(float)this.skin.getWidth())), (int)((GetMousePos().y-this.height/2F)/(((this.height-4)-this.height/2F)/(float)this.skin.getHeight())),
					(int)color[0]<<24 | (int)color[1]<<16 | (int)color[2]<<8 | (int)color[3]);
			
		}
	}
	
	public BufferedImage EditImage(BufferedImage bi)
	{
		boolean flag = GetMousePos().x > 4 && GetMousePos().x < (this.width/2) 
				&& GetMousePos().y > this.height/2 && GetMousePos().y <  this.height-4;
		if(flag)
			if(Mouse.isButtonDown(0))
					bi.setRGB((int)((GetMousePos().x-4)/((this.width/2F-4F)/(float)bi.getWidth())), (int)((GetMousePos().y-this.height/2F)/(((this.height-4)-this.height/2F)/(float)bi.getHeight())), this.BIColor);

		return bi;
	}

	public int GetPixelColor()
	{
		boolean flag = GetMousePos().x > 4 && GetMousePos().x < (this.width/2) 
				&& GetMousePos().y > this.height/2 && GetMousePos().y <  this.height-4;
		if(flag)
			if(Mouse.isButtonDown(0))
				return this.skin.getRGB((int)((GetMousePos().x-4)/((this.width/2F-4F)/(float)skin.getWidth())), (int)((GetMousePos().y-this.height/2F)/(((this.height-4)-this.height/2F)/(float)skin.getHeight())));
		return this.BIColor;
	}
	
	public int GetTexture()
	{		
		ib.clear();
		GLAllocation.generateTextureNames(ib);
		int num = ib.get(0);
		this.mc.renderEngine.setupTexture(this.skin, num);
		return num;
	}
}
