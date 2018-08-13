/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author oumast
 */
public class Envoie extends Thread {
    ObjectOutputStream write;
    Utilisateur ut;
    Scanner sc;
    String msg;
    Message m;
    discussion di;
   String email;
    public Envoie(Utilisateur ut,discussion di,String email ){
        this.ut=ut;
       this.email=email;
        try {
            write=new ObjectOutputStream(ut.sc.getOutputStream());
           
            write.writeObject(new Message(di.jt.getText(),email,ut.Email));
    write.flush();

    di.updateEnvoie();
        } catch (InterruptedException ex) {
                Logger.getLogger(Recevoir.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(Envoie.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   
}
