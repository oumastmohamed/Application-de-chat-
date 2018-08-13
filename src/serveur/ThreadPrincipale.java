/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import client.Message;
import client.Utilisateur;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ThreadPrincipale extends Thread{
    ObjectInputStream read;
    ObjectOutputStream write;
    Utilisateur ut;
    Socket sc;
    BufferedReader aa;
    MiseListe ml;
    ListeClient lc=new ListeClient();
    boolean test=true;
    ThreadPrincipale(Socket sc){
        this.sc=sc;
    
    }
    void  ecouter(){
    
    try {
            read = new ObjectInputStream(this.sc.getInputStream());
            Object obj=read.readObject();
            if(obj instanceof Message){
            Recevoir r=new Recevoir(sc,obj);
            r.start();
            Envoie en=new Envoie((Message) obj);
            }
            else { autoriser  a=new autoriser(sc,obj);
            a.start();
            }
            
        }  catch (java.net.SocketException ex) {
            test=false;
        }catch (IOException ex) {
            Logger.getLogger(ThreadPrincipale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThreadPrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }
  
    public void run(){
    while(test){
        
    ecouter();
            }
    }
}
