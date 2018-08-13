/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class JLabelPhotoBack extends JLabel
        implements ActionListener {

    private int pos_x = 8;
    private int pos_y = 8;
    private final int RADIUS = 100;
    private final int DELAY = 35;

    private Timer timer;
    private ImageIcon imageF,imageB;

    private final double delta[] = { 3, 3 };

    public JLabelPhotoBack() {
        
        loadImage();
        //determineAndSetImageSize();
        //initTimer();
        
    }
    
    private void loadImage() {
        
        imageF = new ImageIcon("C:\\Users\\Toshiba\\Desktop\\miniChatICONE\\yassine.jpg");
        imageB = new ImageIcon("C:\\Users\\Toshiba\\Desktop\\miniChatICONE\\arrierePl.png");
    }
    
    private void determineAndSetImageSize() {
        /*
        
            Image newimg = null;
            newimg = imageF.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
            imageF = newimg;
            
        
        
        int h = imageF.getHeight(this);
        int w = imageF.getWidth(this);
        setPreferredSize(new Dimension(w, h)); */       
    }    

    private void initTimer() {   

        timer = new Timer(DELAY, this);
        timer.start();
    }
    
    private void doDrawing(Graphics g) {
        
        /*Graphics2D g2d = (Graphics2D) g.create();

        g2d.clip(new Ellipse2D.Double(pos_x, pos_y, RADIUS, RADIUS));
        g2d.drawImage(imageF, 8, 8, null); 
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
            g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.dispose();*/
        
        BufferedImage imageBG = new BufferedImage(
            imageB.getIconWidth(),
            imageB.getIconHeight(),
            BufferedImage.TYPE_INT_RGB);
            Graphics g1 = imageBG.createGraphics();
            // paint the Icon to the BufferedImage.
            imageB.paintIcon(null, g1, 0,0);
            g1.dispose();
            
            BufferedImage imageFG = new BufferedImage(
            imageF.getIconWidth(),
            imageF.getIconHeight(),
            BufferedImage.TYPE_INT_RGB);
            g1 = imageFG.createGraphics();
            // paint the Icon to the BufferedImage.
            imageF.paintIcon(null, g1, 0,0);
            g1.dispose();
            
            // presumes the images are identical in size BNI
            int w = imageBG.getWidth();
            int h = imageBG.getHeight();
            Ellipse2D.Double ellipse1 = new Ellipse2D.Double(
                    20, 20, 130, 130); 
            //Ellipse2D.Double ellipse2 = new Ellipse2D.Double(
                  //  w/4,h/4,w/2,h/2);
            Area circle = new Area(ellipse1);
            //circle.subtract(new Area(ellipse2));
            Graphics2D g2d = g2d= imageBG.createGraphics();
            //g2d= imageBG.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
            g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2d.setClip(circle);
            g2d.drawImage(imageFG, 22, 20, null);
            g2d.setClip(null);
            Stroke s = new BasicStroke(2);
            g2d.setStroke(s);
            g2d.setColor(Color.BLACK);
            g2d.draw(circle);
            g2d.dispose();
        
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //moveCircle();
        //repaint();
    }
    
    private void moveCircle() {

        int w = getWidth();
        int h = getHeight();

        if (pos_x < 0) {
            
            delta[0] = Math.random() % 4 + 5;
        } else if (pos_x > w - RADIUS) {
            
            delta[0] = -(Math.random() % 4 + 5);
        }

        if (pos_y < 0 ) {
            
            delta[1] = Math.random() % 4 + 5;
        } else if (pos_y > h - RADIUS) {
            
            delta[1] = -(Math.random() % 4 + 5);
        }

        pos_x += delta[0];
        pos_y += delta[1];
    }       
}

