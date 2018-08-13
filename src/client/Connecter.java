/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import Vues.Liste;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author chaoui
 */
public class Connecter {
    //Socket sc;
    ObjectOutputStream write;
    ObjectInputStream read;
    Utilisateur ut;
   JFrame jf;
    Client cl;
    public Connecter(Utilisateur ut,Client cl,JFrame jf){
    this.ut=ut;
    this.cl=cl;
    this.jf=jf;
        try {
            write=new ObjectOutputStream(ut.sc.getOutputStream());
            write.writeObject(ut);
            write.flush();
            
        } catch (IOException ex) {
            Logger.getLogger(Connecter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Recevoir(){
        try {
            read=new ObjectInputStream(ut.sc.getInputStream());
            
                String msg=(String) read.readObject();System.out.println(msg);
            if(msg.equals("permis")) {
             Liste a=new Liste(ut);
        a.setVisible(true);
        jf.dispose();
            }
            else System.err.println("MERDE");
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Connecter.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            Logger.getLogger(Connecter.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            e.printStackTrace();
            }
    
    }
}
