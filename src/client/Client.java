/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chaoui
 */
public class Client {
    PrintWriter write ;
	BufferedReader read;
	Socket socket ;
	public Client(){
		try {
			socket = new Socket(InetAddress.getLocalHost(),2001);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	

	}
        
        public Socket getSo(){
    return socket;
    }
        
        public void fermeture(){
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
