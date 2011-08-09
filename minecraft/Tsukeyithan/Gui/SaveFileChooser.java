package Tsukeyithan.Gui;

import java.io.*;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;
 

public class SaveFileChooser extends JPanel implements Runnable
{    
	public BufferedImage bi;
	
	public SaveFileChooser(BufferedImage bi)
	{
		this.bi = bi;
	}
	
    public void run() 
    {
    	JFileChooser fc = new JFileChooser(new JFileChooser().getFileSystemView().getHomeDirectory());
        fc.setFileFilter(new FileNameExtensionFilter("jpg", "jpg"));
        fc.setFileFilter(new FileNameExtensionFilter("gif", "gif"));
        fc.setFileFilter(new FileNameExtensionFilter("bmp", "bmp"));
        fc.setFileFilter(new FileNameExtensionFilter("png", "png"));
        int returnVal = fc.showOpenDialog(SaveFileChooser.this); 
        if (returnVal == JFileChooser.APPROVE_OPTION) 
        { 
        	String name = fc.getSelectedFile().getAbsolutePath();
            String name1 = fc.getFileFilter().getDescription();
            if(!name.endsWith(".png") || !name.endsWith(".jpg") || !name.endsWith(".bmp") || !name.endsWith(".gif"))
            	name = name+"."+name1;            
            try { ImageIO.write(bi, "png", new File(name));} 
            catch (IOException ex) {ex.getStackTrace();}
        }
    }
}