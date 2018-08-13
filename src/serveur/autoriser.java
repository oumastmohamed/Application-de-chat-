/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import client.Message;
import client.Utilisateur;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oumast
 */
public class autoriser extends Thread{
    ObjectInputStream read;
    ObjectOutputStream write;
    Utilisateur ut;
    Socket sc;
    MiseListe ml;
    static ListeClient lc=new ListeClient();
    autoriser(Socket sc,Object obj){
        this.sc=sc;
       ut=(Utilisateur) obj;
        System.out.println("fin constructeur");
    }
    void verifier() throws IOException {
        
//fonction pour verifier les données d'un utilisateur et l'ajouter dans une liste

write= new ObjectOutputStream(this.sc.getOutputStream());

            ut.setSc(sc);
            if(ut.verifier()==true){
           lc.addUtil(ut);
            ml=new MiseListe(lc);
             write.writeObject(new String("permis"));
             ml.start();
            }
            
            else write.writeObject(new String(ut.Email+" No "+ut.mdp));
            System.out.println("fin verification .....");

        
    }
    ListeClient getUtilisateur(){
    return this.lc;
    
    }
    public void run(){
   
        try {
           verifier();
           System.out.println(lc.listeCon.size());
        }
            
         catch (IOException ex) {
            Logger.getLogger(autoriser.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
