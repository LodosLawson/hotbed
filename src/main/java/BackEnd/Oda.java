/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import FrontEnd.OdaMelumati;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Acer8
 */
public class Oda extends javax.swing.JButton {
    static int sayi = 0;
    private int id;
    public Oda(String Melumat){
        this.sayi++;
        this.id = this.sayi;
        OdaDaxiliMelumat oda = new OdaDaxiliMelumat(this.sayi);
        oda.setDurumu("Bos");
        oda.setOdaIcersindekiOdaSayi(3);
        oda.setNomresi(this.sayi);
        oda.setReng(new java.awt.Color(0, 204, 0));
        this.setText("Oda-"+Oda.sayi);
        this.setBackground(new java.awt.Color(0, 204, 0));
        this.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
                    System.out.println("salam"+oda.getNomresi());
                    System.out.println("salam"+id);
                    OdaMelumati Od = new OdaMelumati();
                    Od.MelumatDaxili(oda.getNomresi(), oda.getOdaIcersindekiOdaSayi(), oda.getDurumu(), oda.getReng());
                    Od.setVisible(true);
         }
      });
    }         
}
