/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JTextArea;

/**
 *
 * @author oumast
 */
public class discussion  extends Thread{
    JTextArea jt;
    JTextArea jt2;
    String Email;
    
   public  discussion(JTextArea jTextArea1, JTextArea jTextArea2,Object item) {
         jt=jTextArea1;
         jt2=jTextArea2;
         Email=(String) item;
         
    }
    synchronized void updateEnvoie() throws InterruptedException{
        
    jt2.setText(jt2.getText()+"\n"+jt.getText());
    jt.setText("");
   
    wait(100);
    }
    
    synchronized void updateRecevoir(Message msg) throws InterruptedException{
   if(msg.EmailEn.equals(Email)){
  System.err.println(msg.EmailE+""+Email);
    jt2.setText(jt2.getText()+"\n"+msg.message);
    notifyAll();
    }
   
    }
}
