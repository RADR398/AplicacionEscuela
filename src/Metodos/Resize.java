/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author rommel
 */
public class Resize {
    
    
    public static ImageIcon Redimencionar(BufferedImage bufferedImage){
    
        int width = bufferedImage.getWidth();
        int height =  bufferedImage.getHeight();

        BufferedImage bufim = new BufferedImage(160,
            160, 5);
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(bufferedImage, 0, 0,160,
            160, 0, 0, width, height, null);

        g.dispose();
        
        return new ImageIcon(bufim);
   
    }
}
