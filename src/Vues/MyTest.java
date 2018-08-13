/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

/**
 *
 * @author chaoui
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
 
public class MyTest {
 
    
    private int i;
    private int n;
    private long t;
    private JLabel l;
    private Thread tr;
    private boolean re = true;
    String photo;
    Runnable threadTask;
 
    public MyTest(int n, long t ,JLabel l,String photo) {
     this.n =n;
     this.t = t;
     this.l = l;
     this.photo = photo;
    }
    
    
     public void lance(int n, long t ,JLabel l,String photo)
    {
        
         threadTask = new Runnable() {
        
            @Override
            public void run() {
                for( i = 0; i<n; i++) {
 
                    try {
                        Thread.sleep(t);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    SwingUtilities.invokeLater(new Runnable() {
 
                        @Override
                        public void run() {
                            ImageIcon nv1 = new ImageIcon(getClass().getResource(photo+i+".png"));
                            l.setIcon(nv1);
                            
                        }
                    });
                    
                    if(i==n-1) i=0;
                }

            }
        };
 
        tr = new Thread(threadTask);
        tr.start();
    }
    
    
    
    public void lance()
    {
        
         threadTask = new Runnable() {
        
            @Override
            public void run() {
                for( i = 0; i<n; i++) {
 
                    try {
                        Thread.sleep(t);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    SwingUtilities.invokeLater(new Runnable() {
 
                        @Override
                        public void run() {
                            ImageIcon nv1 = new ImageIcon(getClass().getResource(photo+i+".png"));
                            l.setIcon(nv1);
                            
                        }
                    });
                    
                    if(i==n-1) i=0;
                }

            }
        };
 
        tr = new Thread(threadTask);
        tr.start();
    }
    
    public void stop()
    {
        tr.stop();
    }
    
  public void lancewait()
    {
        
         threadTask = new Runnable() {
        
            @Override
            public void run() {
                for( i = 0; i<n; i++) {
 
                    try {
                        Thread.sleep(t);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    SwingUtilities.invokeLater(new Runnable() {
 
                        @Override
                        public void run() {
                            
                            ImageIcon nv1 = new ImageIcon(getClass().getResource(photo+i+".png"));
                            l.setIcon(nv1);
                            
                        }
                    });
                    
                    
                }

            }
        };
 
        tr = new Thread(threadTask);
        tr.start();
    }
  
  public void lancewait2()
    {
        
         threadTask = new Runnable() {
        
            @Override
            public void run() {
                for( i = 0; i<n; i++) {
 
                    
                    SwingUtilities.invokeLater(new Runnable() {
 
                        @Override
                        public void run() {
                            System.err.println(photo+i);
                            ImageIcon nv1 = new ImageIcon(getClass().getResource(photo+i+".jpg"));
                            l.setIcon(nv1);
                            
                        }
                    });
                    
                    try {
                        Thread.sleep(t);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    
                    if(i==n-1) i=0;
                }

            }
        };
 
        tr = new Thread(threadTask);
        tr.start();
    }
 
        
   

 
}