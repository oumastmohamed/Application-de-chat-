/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oumast
 */
public class Serveur extends Thread{
    ServerSocket socketserver  ;
   // Socket socketduserveur ;
    
    
    Serveur(){
        try {
            
            socketserver = new ServerSocket(2001);
           System.out.println("en attent......");
          /* socketduserveur = socketserver.accept(); 
            System.out.println("Un utilsateur est connecter :D");*/
        } catch (IOException ex) {
            Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void run(){
        accepter a=new accepter(socketserver);
        a.start();
    
    }
    
  
    void fermeture(){
        try {
            socketserver.close();
        } catch (IOException ex) {
            Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
