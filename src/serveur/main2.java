/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;



/**
 *
 * @author oumast
 */
public class main2 {
     public static void main(String[] args) {
     
     Serveur s=new Serveur();
    s.start();
  /* Envoie en=new Envoie(s.getSo());
       Recevoir re=new Recevoir(s.getSo());
      en.start();
       re.start();*/
     }
}
