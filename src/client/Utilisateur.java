/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author oumast
 */
public class Utilisateur implements Serializable  {
   public String Nom;
   public String Prenom;
   public  String Email;
    public String mdp;
    public transient Socket sc;
    
    public Utilisateur(String Email,String mdp,String nom,String prenom,Socket sc){
        this.Nom=nom;
        this.Prenom=prenom;
        this.Email=Email;
        this.mdp=mdp;
        this.sc=sc;
        
    }
    public void setSc(Socket sc){
    this.sc=sc;
    }
    public boolean verifier(){
        ArrayList<Utilisateur> Ut=new ArrayList<Utilisateur>();
        boolean b=false;
        Ut.add(new Utilisateur("s.houndaze@gmail.com","zakaria147","zakaria","houndaze",null));
        Ut.add(new Utilisateur("s.houndaze@hotmail.com","zakaria123","yassine","ait addi",null));
        for(int i=0;i<Ut.size();i++){
        if (Email.equals(Ut.get(i).Email) && mdp.equals(Ut.get(i).mdp)) {b=true;
        this.Nom=Ut.get(i).Nom;
        this.Prenom=Ut.get(i).Prenom;
        }
        
        }
        return b;
    }
    
}
