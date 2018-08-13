/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oumast
 */
public class MiseListe extends Thread{
    ListeClient lc;
    ObjectOutputStream write;
    MiseListe(ListeClient lc){
        this.lc=lc;
    }
    
    public void run(){
        
    for(int i=0;i<lc.listeCon.size();i++){
        try {
            System.err.println("envoie "+lc.listeCon.get(i).sc);
            write=new ObjectOutputStream(lc.listeCon.get(i).sc.getOutputStream());
            write.writeObject(lc.listeCon);
            write.flush();
             System.err.println("fin envoie "+lc.listeCon.get(i).sc);
        } catch (IOException ex) {
            Logger.getLogger(MiseListe.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }
}
