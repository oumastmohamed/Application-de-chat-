/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ConnexionDb {
    Connection connection = null;
    Statement statement = null;
    ResultSet result = null;
    ConnexionDb() throws SQLException 
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnexionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "minichat", "zakaria123");
       
   
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
   if(connection !=null){
       System.err.println("bien");
   statement=(Statement) connection.createStatement();
   }
   else  System.err.println("NONO");
    }
    public void executer() throws SQLException{
    result=statement.executeQuery("select * from utilisateur");
    while(result.next()){
   System.out.println(result.getString(1));
    
    }
    }
    public static void main(String args[]) throws SQLException{
    ConnexionDb cd=new ConnexionDb();
    cd.executer();
        
    }
    public Connection getCon(){
        return connection;
    }
}
