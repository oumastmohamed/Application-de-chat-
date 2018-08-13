/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;


import client.Message;
import client.Utilisateur;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oumast
 */
public class Envoie extends Thread {
    ObjectOutputStream write;
    Utilisateur ut;
  Envoie(Message msg){
  for(int i=0;i<autoriser.lc.listeCon.size();i++){
  if(msg.EmailE.equals(autoriser.lc.listeCon.get(i).Email)){
      
  ut=autoriser.lc.listeCon.get(i);
  }
  }
        try {
            write=new ObjectOutputStream(ut.sc.getOutputStream());
            write.writeObject(msg);
            write.flush();
            System.out.println("message sera envoyé a "+ut.sc);
        } catch (IOException ex) {
            Logger.getLogger(Envoie.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
}
