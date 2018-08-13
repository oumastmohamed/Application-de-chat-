/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import client.Utilisateur;
import java.util.ArrayList;

/**
 *
 * @author oumast
 */
public class ListeClient extends Thread{
     public static ArrayList<Utilisateur> listeCon=new ArrayList<Utilisateur>();
   // Utilisateur ut;
    ListeClient(){
   // this.ut=ut;
    }
    void addUtil(Utilisateur ut){
    listeCon.add(ut);
    
    }
   
    public void run(){
    
    while(!isInterrupted()){
    if(!listeCon.isEmpty()){
    
    }
    }
    }
    
}
