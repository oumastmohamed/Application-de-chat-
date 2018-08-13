/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

/**
 *
 * @author Toshiba
 */
    import java.awt.*;
    import java.awt.geom.*;
    import java.awt.image.BufferedImage;
    import java.net.URL;
    import javax.imageio.ImageIO;
    import javax.swing.*;

    public class PhotoClientEnLigne {
        
        PhotoClientEnLigne(ImageIcon BG,ImageIcon FG,JLabel l) {
            
            Image imageF = FG.getImage();
            Image newimg = null;
            newimg = imageF.getScaledInstance(90, 90,  java.awt.Image.SCALE_SMOOTH);
            imageF = newimg;
            
            FG.setImage(imageF);
            
            BufferedImage imageBG = new BufferedImage(
            BG.getIconWidth(),
            BG.getIconHeight(),
            BufferedImage.TYPE_INT_RGB);
            Graphics g1 = imageBG.createGraphics();
            // paint the Icon to the BufferedImage.
            BG.paintIcon(null, g1, 0,0);
            g1.dispose();
            
            BufferedImage imageFG = new BufferedImage(
            FG.getIconWidth(),
            FG.getIconHeight(),
            BufferedImage.TYPE_INT_RGB);
            g1 = imageFG.createGraphics();
            // paint the Icon to the BufferedImage.
            FG.paintIcon(null, g1, 0,0);
            g1.dispose();
            
            
            
            // presumes the images are identical in size BNI
            int w = imageBG.getWidth();
            int h = imageBG.getHeight();
            Ellipse2D.Double ellipse1 = new Ellipse2D.Double(
                    4, 4, 90, 90); 
            //Ellipse2D.Double ellipse2 = new Ellipse2D.Double(
                  //  w/4,h/4,w/2,h/2);
            Area circle = new Area(ellipse1);
            //circle.subtract(new Area(ellipse2));
            Graphics2D g = imageBG.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
            g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g.setClip(circle);
            g.drawImage(imageFG, 5, 4, null);
            g.setClip(null);
            Stroke s = new BasicStroke(2);
            g.setStroke(s);
            g.setColor(Color.BLACK);
            g.draw(circle);
            g.dispose();
            l.setBounds(0, 0, imageBG.getWidth(),imageBG.getHeight());
            
            l.setIcon(new ImageIcon(imageBG));
            
            
            
        }
        public static void main(String[] args) throws Exception {
            ImageIcon BG = new ImageIcon("C:\\Users\\Toshiba\\Desktop\\miniChatICONE\\affichpro.jpg");
            ImageIcon FG = new ImageIcon("C:\\Users\\Toshiba\\Desktop\\miniChatICONE\\yassine.jpg");
            //URL urlFG = new URL("C:\\Users\\Toshiba\\Desktop\\miniChatICONE\\yassine.jpg");
            //URL urlBG = new URL("C:\\Users\\Toshiba\\Desktop\\miniChatICONE\\arrierePl.png");
            //final BufferedImage biFG = ImageIO.read(urlFG);
            //final BufferedImage biBG = ImageIO.read(urlBG);
            SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run() {
                    JFrame f = new JFrame();
                    f.setBounds(0, 0, 460, 320);
                    //f.setLocationRelativeTo(null);
                    
                    JLabel jLabel2 = new JLabel();
                    jLabel2.setBounds(0, 0, 90, 90);
                    new PhotoClientEnLigne(BG, FG,jLabel2);
                    f.add(jLabel2);
                    f.setVisible(true);
                }
            });
        }
    }
