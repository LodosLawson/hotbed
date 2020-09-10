/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.awt.Color;

/**
 *
 * @author Acer8
 */
public class OdaDaxiliMelumat {
    private int Nomresi;
    private int OdaIcersindekiOdaSayi;
    private String Durumu;
    private Color Reng;
    
    public OdaDaxiliMelumat(int Nomresi){
        this.Nomresi = Nomresi;
    }
    
    public void setNomresi(int Nomresi) { this.Nomresi = Nomresi; }
    public void setOdaIcersindekiOdaSayi(int OdaIcersindekiOdaSayi) { this.OdaIcersindekiOdaSayi = OdaIcersindekiOdaSayi; }
    public void setDurumu(String Durumu) { this.Durumu = Durumu; }
    public void setReng(Color Reng) { this.Reng = Reng; }
    public int getOdaIcersindekiOdaSayi() { return OdaIcersindekiOdaSayi; }
    public String getDurumu() { return Durumu; }
    public Color getReng() { return Reng; }
    public void setMelumat(String Melumat) { this.Durumu = Melumat; }
    public int getNomresi() { return Nomresi; }
    public String getMelumat() { return Durumu; }
    
    
}
