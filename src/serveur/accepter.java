

package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oumast
 */
public class accepter extends Thread{
ServerSocket socketserver;
Socket socketduserveur ;
autoriser a;
Envoie e;
    Recevoir r;
    accepter(ServerSocket socketserver) {        
        this.socketserver=socketserver;
        
    }
  
    public void run(){
    while(true){
        try {
            
            socketduserveur=socketserver.accept();
            System.out.println("connexion avec"+socketduserveur);
            Thread t=new ThreadPrincipale(socketduserveur);
            t.start();
           /* a=new autoriser(socketduserveur);
            System.out.println("commencer Thread"+socketduserveur);
            a.start();*/
          /* r=new Recevoir(socketduserveur);
           r.start();*/
        } catch (IOException ex) {
            Logger.getLogger(accepter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}}
