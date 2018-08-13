/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import Vues.FenetreChatActive;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;

/**
 *
 * @author user
 */
public class ThreadChat extends Thread{
   ObjectInputStream read;
    Utilisateur ut;
   public  static Object obj;
    
    JList jl;
    public ThreadChat(Utilisateur ut,JList jl){
    this.ut=ut;
    this.jl=jl;
    }
    
    void ecouteSocket(){
       try {
           System.out.println("commencer la lecture");
           read = new ObjectInputStream(this.ut.sc.getInputStream());
            obj=read.readObject();
           if(obj instanceof ArrayList){
           System.out.println("un utilisateur va se connecter");
           MiseList ml=new MiseList(jl,ut.sc,obj);
       ml.mise();}
           else {
               
               FenetreChatActive fca=new FenetreChatActive(ut);
               fca.ajouterByObjet();
           }
     
       } catch (IOException ex) {
           Logger.getLogger(ThreadChat.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(ThreadChat.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    public void run(){
    while(true)
    ecouteSocket();
       
    }
}
