/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import client.Message;
import client.Utilisateur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */

public class DoaMessage {
     ArrayList<Utilisateur> lu=new ArrayList<Utilisateur>();
    Utilisateur ut;
    Message m;
ConnexionDb db;
    Statement statement;
    ResultSet rs;
    static int i=0;
   public  DoaMessage(){
        try {
            db=new ConnexionDb();
            statement=db.getCon().createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(DoaUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
   public void insererMessage(Message msg){
       System.err.println("bdd");
         try {
             statement.executeQuery("insert into message values(id_seq.nextval,'"+msg.message+"')");
         } catch (SQLException ex) {
             Logger.getLogger(DoaMessage.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
    public void insererEnvoyer(Message msg){
       System.err.println("bdd");
         try {
             statement.executeQuery("insert into envoyer_message ENVOYER values(id_seq.CURRVAL,'"+msg.EmailEn+"')");
         } catch (SQLException ex) {
             Logger.getLogger(DoaMessage.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
    public void insererRecevoir(Message msg){
       System.err.println("bdd");
         try {
             statement.executeQuery("insert into recevoir_message ENVOYER values(id_seq.CURRVAL,'"+msg.EmailE+"')");
         } catch (SQLException ex) {
             Logger.getLogger(DoaMessage.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
}
