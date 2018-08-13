/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author oumast
 */
public class Recevoir  extends Thread{
    BufferedReader read;
    
    discussion di;
    Utilisateur s;
    public Recevoir(Utilisateur s,discussion di){
        this.s=s;
        this.di=di;
       
    
    }
    public void run(){
    while(true){
        if(ThreadChat.obj instanceof Message){
          //  FenetreChatActive fc=new FenetreChatActive();
         //   fc.ajouterByObjet();
        try {
            System.out.println(s.Email);
        di.updateRecevoir((Message) ThreadChat.obj);
         } catch (InterruptedException ex) {
                Logger.getLogger(Recevoir.class.getName()).log(Level.SEVERE, null, ex);
            }    
    ThreadChat.obj=new Integer(1);
        }}
    }
}
