package Tsukeyithan.Gui;

import java.io.*;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;
 

public class ColorChooser extends JPanel implements Runnable
{    	
    public void run() 
    {
    	GuiSkinEditor.BIColor = JColorChooser.showDialog(null, "couleur du fond", Color.WHITE).getRGB();
    }
}