/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Vues.ChatWindow;
import client.Message;
import client.ThreadChat;
import client.Utilisateur;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class FenetreChatActive extends Thread{
    public static Message obj;
    public Utilisateur ut;
   
    //une methode qui ajoute les fenetre apparait 
    private static ArrayList<ChatWindow> lw=new ArrayList<ChatWindow>();
    static void ajouter(ChatWindow cw){
    lw.add(cw);
    }
    //Constructeur
   public  FenetreChatActive(Utilisateur ut){
        this.ut=ut;
   }
    
    
    
    //une fentre qui fait apparaitre les fentre non apparait
    public  void ajouterByObjet(){
 Message msg=(Message) ThreadChat.obj;
       if(msg!=obj){
       System.out.println("execution de l'idéé");
       
       if(lw.size()>0){
       for(int i=0;i<lw.size();i++){
      if(!msg.EmailEn.equals(lw.get(i).Email)){
       System.out.println("une fenetre va apparaitre");
       
      }
       }}
       else {
           
           System.out.println(msg.EmailEn+"une fenetre va apparaitre");
       ChatWindow cw=new ChatWindow(msg.EmailEn,ut);
     cw.setVisible(true);
     FenetreChatActive.ajouter(cw);
       }
       System.out.println("fin execution de l'idéé");
       obj=obj;
       }
       
    
    
    }
}
