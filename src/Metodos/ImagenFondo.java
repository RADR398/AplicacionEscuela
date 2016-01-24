/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;
import javax.swing.text.MaskFormatter;

public class ImagenFondo extends JDesktopPane {

        private final Image image;
        public static Image Icono;
        public static Image fondoLogin;
        static String url = System.getProperty("user.dir") + "/src/Image/";
        public static Icon icon;
        
        public ImagenFondo() {

            ImageResizer imax = new ImageResizer();
            
            image = ImageResizer.loadImage(url + "Fondo.jpg");
            getIcono();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(image, 0, 0, null);
        }

        
        public final void getIcono(){
        
            icon = new ImageIcon(url+"Icono.png");
            Icono = new ImageIcon(url+"Icono.png").getImage();
            fondoLogin = new ImageIcon(url+"FondoLogin.jpg").getImage();
            
            
        }
    public static AbstractFormatterFactory getFormato(String parametros){ 
        
        AbstractFormatterFactory formato = new JFormattedTextField.AbstractFormatterFactory() 
        {
            @Override
            public JFormattedTextField.AbstractFormatter getFormatter(JFormattedTextField tf) {
                try {
                    return new MaskFormatter(parametros);
                } catch (Exception ex) {
                    Logger.getLogger(ImagenFondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
            }
        };
   
      return formato;     
    }
    
    
    }

//eres mi bendicion,