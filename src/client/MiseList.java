/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author oumast
 */
public class MiseList extends Thread{
    JList jList1;
    DefaultListModel list;
    ObjectInputStream read;
    Socket sc;
    Object obj;
    //construteur
    MiseList(JList list, Socket sc,Object obj){
        this.jList1=list;
    this.sc=sc;
    this.obj=obj;
     System.err.println("comencer mise ajour");
    }
    // redefinition de la methode 
    public void mise(){
if(obj instanceof ArrayList){
            ArrayList<Utilisateur> lc=(ArrayList<Utilisateur>) obj;
            list=new DefaultListModel();
            for(int i=0;i<lc.size();i++){
               // list.addElement(lc.get(i).Nom+" "+lc.get(i).Prenom);
                 list.addElement(lc.get(i).Email);
            }
            jList1.setModel(list);
            
            System.err.println("mise ajour");
       
            }}
    
    
    }

