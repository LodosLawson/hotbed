/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import FrontEnd.OdaMelumati;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Acer8
 */
public class Oda extends javax.swing.JButton {
    static int sayi = 0;
    private int id;
    
    private static OdaDaxiliMelumat oda;
    
    public void setOdaObject(OdaDaxiliMelumat AS){ this.oda = AS; }
    
    public Oda(OdaDaxiliMelumat oda){
        
        this.sayi++;
        this.id = this.sayi;
     
        this.setText("Oda-"+this.sayi);
        this.setBackground(oda.getReng());

        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {            
                OdaMelumati Od = new OdaMelumati();
                Od.MelumatDaxili(oda.getNomresi(), oda.getOdaIcersindekiOdaSayi(), oda.getDurumu(), oda.getReng(), oda.getIsim(),
                    oda.getSoyIsim(), oda.getSVBNumarasi());
                Od.setVisible(true);
            }
        });
       // System.out.println(oda.getReng());
    }         
}
