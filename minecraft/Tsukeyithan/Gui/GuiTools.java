package Tsukeyithan.Gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.src.Tessellator;

public abstract class GuiTools {
	
	protected float zLevel;
	
	public void DrawTexturedRect(float posX, float posY, float sizeX, float sizeY){
		DrawTexturedRect(posX,posY, sizeX,sizeY, 0, 0, 1, 1);
	}
	
	
	public void DrawTexturedRect(float posX, float posY, float sizeX, float sizeY, float u1, float v1, float u2, float v2){

		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(posX, posY, this.zLevel, u1, v1);
		tessellator.addVertexWithUV(posX, posY+sizeY, this.zLevel, u1, v1+v2);
		tessellator.addVertexWithUV(posX+sizeX, posY+sizeY, this.zLevel, u1+u2, v1+v2);
		tessellator.addVertexWithUV(posX+sizeX, posY, this.zLevel, u1+u2, v1);
		tessellator.draw();
	}
}
