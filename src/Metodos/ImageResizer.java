/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
 
public class ImageResizer {
    //Ancho máximo
    public static int MAX_WIDTH;
    //Alto máximo
    public static int MAX_HEIGHT;
 
    public ImageResizer(){
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tam = toolkit.getScreenSize();
        MAX_WIDTH = tam.width;
        MAX_HEIGHT = tam.height-120;
        
    
    }    
    /*
    Este método se utiliza para cargar la imagen de disco
    */
    public static Image loadImage(String pathName) {
        BufferedImage bimage;
        Image image = null;
        try {
            
            bimage = ImageIO.read(new File(pathName));
            bimage  = resize(bimage, MAX_WIDTH, MAX_HEIGHT);
            image = (Image)bimage;
            
        } catch (Exception e) {
        }
        return image;
    }   
    /*
    Este método se utiliza para redimensionar la imagen
    */
    public static BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) {
        int w = bufferedImage.getWidth();
        int h = bufferedImage.getHeight();
        BufferedImage bufim = new BufferedImage(newW, newH, bufferedImage.getType());
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(bufferedImage, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return bufim;
    }
    
    
        /*
    Este método se utiliza para almacenar la imagen en disco
    */
//    public static void saveImage(BufferedImage bufferedImage, String pathName) {
//        try {
//            String format = (pathName.endsWith(".png")) ? "png" : "jpg";
//            File file =new File(pathName);
//            file.getParentFile().mkdirs();
//            ImageIO.write(bufferedImage, format, file);
//        } catch (IOException e) {
//        }
//    }
    //    public static void copyImage(String filePath, String copyPath) {
//        BufferedImage bimage = loadImage(filePath);
//        if(bimage.getHeight()>bimage.getWidth()){
//            int heigt = (bimage.getHeight() * MAX_WIDTH) / bimage.getWidth();
//            bimage = resize(bimage, MAX_WIDTH, heigt);
//            int width = (bimage.getWidth() * MAX_HEIGHT) / bimage.getHeight();
//            bimage = resize(bimage, width, MAX_HEIGHT);
//        }else{
//            int width = (bimage.getWidth() * MAX_HEIGHT) / bimage.getHeight();
//            bimage = resize(bimage, width, MAX_HEIGHT);
//            int heigt = (bimage.getHeight() * MAX_WIDTH) / bimage.getWidth();
//            bimage = resize(bimage, MAX_WIDTH, heigt);
//        }
//        saveImage(bimage, copyPath);
//    }
     
}
