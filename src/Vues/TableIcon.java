/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

/**
 *
 * @author Toshiba
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.*;

public class TableIcon extends JFrame   {

    private static final long serialVersionUID = 1L;
    protected JTable table;
    private JLabel myLabel = new JLabel("waiting");
    private int pHeight = 30;
    DefaultTableModel model;
    JTable target;
    int row ;
    int column ;
    ImageIcon myIcon;

    public TableIcon() {
        
        
        ImageIcon[] Icon = new ImageIcon[30];
        
        for(int i = 0; i<30;i++){
         Icon[i] = new ImageIcon(getClass().getResource("monEmo/"+i+".png"));}
        
        
        String[] columnNames = {"Picture", "Picture", "Picture", "Picture", "Picture", "Picture", "Picture", "Picture", "Picture", "Picture"};
        
        Object[][] data = new Object[3][10]; 
        int count = 0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<10;j++)
            {
                
                data[i][j]=Icon[i*10+j];
                
            }
        }
        
        model = new DefaultTableModel(data, columnNames) {

            private static final long serialVersionUID = 1L;
            //  Returning the Class of each column will allow different
            //  renderers to be used based on Class

            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        table = new JTable(model);
        table.setTableHeader(null);
        table.setCellSelectionEnabled(true);
        table.setColumnSelectionAllowed(false);
        table.setRowSelectionAllowed(false);
        table.setRowHeight(pHeight);
        for(int j = 0;j<10;j++)table.getColumnModel().getColumn(j).setPreferredWidth(30);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        myLabel.setPreferredSize(new Dimension(30, pHeight));
        myLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(myLabel, BorderLayout.SOUTH);
        //table.addMouseListener(this);
       
        
        table.addMouseListener(new MouseAdapter() { 
                public void mouseClicked(MouseEvent e) { 

                     // change text of button after click

                     if (e.getClickCount() == 1) {
            target = (JTable)e.getSource();
            row = target.getSelectedRow();
            column = target.getSelectedColumn();
            myIcon = (ImageIcon) table.getModel().getValueAt(row, column);
            System.err.println(row+" "+column);
             myLabel.setIcon(myIcon);
        }
                } 
         });        
    }
        
        
    

    public ImageIcon getImageSelected() {
         
       return  myIcon;            
    }

    public static void main(String[] args) {
        TableIcon frame = new TableIcon();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocation(150, 150);
        frame.pack();
        frame.setVisible(true);
        frame.getImageSelected();
    }

    /*@Override
    public void mouseClicked(MouseEvent e) {
       if (e.getClickCount() == 1) {
            target = (JTable)e.getSource();
            row = target.getSelectedRow();
            column = target.getSelectedColumn();
            myIcon = (ImageIcon) table.getModel().getValueAt(row, column);
            System.err.println(row+" "+column);
             myLabel.setIcon(myIcon);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }*/
}
