/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import client.Envoie;
import client.Recevoir;
import client.Utilisateur;
import client.discussion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static java.lang.Short.MAX_VALUE;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
//import oracle.net.aso.i;


/**
 *
 * @author HOUNDAZE
 */
public class ChatWindow extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form ChatWindow
     */
    Utilisateur cl;
    Recevoir re;
    discussion di;
    String Email;
    MyTest test;
    JTable tbleIcon;
    TableIcon frame = new TableIcon();
    ImageIcon emo;
    ImageIcon photoshow,photosend;
    File filesend;
    JFileChooser jFileChooser;
    
    
    public ChatWindow(Object item, Utilisateur cl) {
       // initComponents();
       /* this.cl=cl;
         Email=(String) item;
        di=new discussion(jTextArea1,jTextArea2,Email);
        Recevoir r=new Recevoir(cl,di);
        
        r.start();*/
    }

    ChatWindow() {
        //To change body of generated methods, choose Tools | Templates.
  initComponents();
        
        
        
        
        frame.setLocation(50, 110);
        frame.pack();
        frame.table.addMouseListener(this); 
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setMaximumSize(new java.awt.Dimension(654, 455));
        setMinimumSize(new java.awt.Dimension(654, 455));
        setPreferredSize(new java.awt.Dimension(670, 492));
        getContentPane().setLayout(null);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(64, 11, 570, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vues/send1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 290, 120, 120);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vues/openfile.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 340, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vues/emoticon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 300, 30, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vues/photo.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 380, 30, 30);

        jScrollPane3.setViewportView(jTextPane1);
        jTextPane1.getAccessibleContext().setAccessibleParent(jScrollPane2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(60, 300, 440, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vues/arr.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 654, 455);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                test = new MyTest(12,100,jLabel1,"sendwait");
                test.lance();
            }
        });
        
        //ImageIcon nv1 = new ImageIcon(getClass().getResource("sendwait"+5+".png"));
        //jLabel1.setIcon(nv1);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        test.stop();
        ImageIcon nv1 = new ImageIcon(getClass().getResource("send0.png"));
        jLabel1.setIcon(nv1);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        test.stop();
        ImageIcon nv1 = new ImageIcon(getClass().getResource("sendOk0.png"));
        jLabel1.setIcon(nv1);
        
        //Envoie en=new Envoie(cl,di,Email);
        //en.start();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
       
        
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jTextArea2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextArea2MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        ImageIcon nv1 = new ImageIcon(getClass().getResource("openfileENTR.png"));
        jLabel3.setIcon(nv1);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        ImageIcon nv1 = new ImageIcon(getClass().getResource("openfile.png"));
        jLabel3.setIcon(nv1);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                test = new MyTest(2,150,jLabel3,"openfileclick");
                test.lancewait();
            }
        });

        JFileChooser choix = new JFileChooser();
        choix.setDialogTitle("Choisir une image");
        
        int retour = choix.showOpenDialog(null);
 
        if (retour == JFileChooser.APPROVE_OPTION) {
         String name = choix.getSelectedFile().getName();
         String path = choix.getSelectedFile().getAbsolutePath();              
            
        }
   
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                test = new MyTest(2,150,jLabel4,"emoticoneclick");
                test.lancewait();
            }
        });
        
        frame.setVisible(true);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        ImageIcon nv1 = new ImageIcon(getClass().getResource("emoticonentree.png"));
        jLabel4.setIcon(nv1);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        ImageIcon nv1 = new ImageIcon(getClass().getResource("emoticon.png"));
        jLabel4.setIcon(nv1);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                test = new MyTest(2,150,jLabel5,"photoclick");
                test.lancewait();
            }
        });
        
        FileFilter imagesFilter = new FileNameExtensionFilter("Images", "bmp", "gif", "jpg", "jpeg", "png");
 
        
        JFileChooser choix = new JFileChooser();
        choix.setDialogTitle("Choisir une image");
        choix.addChoosableFileFilter(imagesFilter);
        choix.setAcceptAllFileFilterUsed(false);
        int retour = choix.showOpenDialog(null);
 
        if (retour == JFileChooser.APPROVE_OPTION) {
         String name = choix.getSelectedFile().getName();
         String path = choix.getSelectedFile().getAbsolutePath();              
            System.err.println(name+" \n"+path);
            photoshow = new ImageIcon(path);
            photosend = new ImageIcon(path);
            
            Image img = photoshow.getImage();
            Image newimg = null;
            if(photoshow.getIconWidth()>500 || photoshow.getIconHeight()>500 )  newimg = img.getScaledInstance(200, 100,  java.awt.Image.SCALE_SMOOTH);
            else if (photoshow.getIconWidth()<500 && photoshow.getIconHeight()<500 ) {
                if (photoshow.getIconWidth()<200 && photoshow.getIconHeight()<100 ) newimg = img.getScaledInstance(photoshow.getIconWidth(), photoshow.getIconHeight(),  java.awt.Image.SCALE_SMOOTH);
                else newimg = img.getScaledInstance(photoshow.getIconWidth()-40, photoshow.getIconHeight()-40,  java.awt.Image.SCALE_SMOOTH);
            }
            photoshow = new ImageIcon(newimg);
            jTextPane1.insertIcon(photoshow);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        ImageIcon nv1 = new ImageIcon(getClass().getResource("photoenter.png"));
        jLabel5.setIcon(nv1);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        ImageIcon nv1 = new ImageIcon(getClass().getResource("photo.png"));
        jLabel5.setIcon(nv1);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
     /*   Envoie en=new Envoie(cl,di,Email);
        en.start();*/
    }

    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnecerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnecerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnecerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnecerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
            emo = frame.getImageSelected();
            jTextPane1.insertIcon(emo);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    private Vector<String> readFile(String filename)
{
  Vector<String> records = new Vector<String>();
  try
  {
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = reader.readLine()) != null)
    {
      records.add(line);
    }
    reader.close();
    return records;
  }
  catch (Exception e)
  {
    System.err.format("Exception occurred trying to read '%s'.", filename);
    e.printStackTrace();
    return null;
  }
}
}
