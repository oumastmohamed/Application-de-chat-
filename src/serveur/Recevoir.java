/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;


import client.Message;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oumast
 */
public class Recevoir  extends Thread{
  ObjectInputStream read;
    Message msg;
    Socket s;
    Object obj;
    public Recevoir(Socket s,Object obj){
        this.s=s;
        this.obj=obj;
        System.out.println("bloqué");
        System.out.println("encore bloqué");
    
    }
    public void run(){
        
            msg=(Message) obj;
            
            System.out.println("Client dit :"+s+" "+msg.message);
      
    }
    
}
