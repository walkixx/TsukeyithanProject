package Tsukeyithan.Gui;

import java.io.*;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;

import Tsukeyithan.Manager.TKHConfig;
 

public class LoadFileChooser extends JPanel implements Runnable
{    
	public File file;
	
    public void run() 
    {
    	JFileChooser fc = new JFileChooser(new JFileChooser().getFileSystemView().getHomeDirectory());
        fc.setFileFilter(new FileNameExtensionFilter("jpg", "jpg"));
        fc.setFileFilter(new FileNameExtensionFilter("gif", "gif"));
        fc.setFileFilter(new FileNameExtensionFilter("bmp", "bmp"));
        fc.setFileFilter(new FileNameExtensionFilter("png", "png"));
        int returnVal = fc.showOpenDialog(LoadFileChooser.this); 
        if (returnVal == JFileChooser.APPROVE_OPTION) 
        { 
        	try {
				GuiSkinEditor.skin = ImageIO.read(new FileInputStream(fc.getSelectedFile()));
			} catch (IOException e) {e.printStackTrace();}
        }
    }
}