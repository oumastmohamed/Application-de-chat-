package Connexion;


import Connexion.ConnexionDb;
import client.Utilisateur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DoaUtilisateur {
    ArrayList<Utilisateur> lu=new ArrayList<Utilisateur>();
    Utilisateur ut;
    ConnexionDb db;
    Statement statement;
    ResultSet rs;
    public DoaUtilisateur(){
        try {
            db=new ConnexionDb();
            statement=db.getCon().createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(DoaUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean verifierUtilisateur(Utilisateur ut) throws SQLException{
       boolean ver=false;
        rs=statement.executeQuery("select * from utilisateur");
    while(rs.next()){
   if(ut.Email.equals(rs.getString(1)) && ut.mdp.equals(rs.getString(4)) ){
  ver=true;
   }
    
    }
        
    return ver;
    }
}
