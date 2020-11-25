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
    private String Isim;
    private String SoyIsim;
    private int SVBNumarasi;
    private String Vaxt;
    
    public OdaDaxiliMelumat(){
      
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
    public String getIsim() { return Isim; }
    public String getSoyIsim() { return SoyIsim; }
    public int getSVBNumarasi() { return SVBNumarasi; }
    public void setIsim(String Isim) { this.Isim = Isim; }
    public void setSoyIsim(String SoyIsim) { this.SoyIsim = SoyIsim; }
    public void setSVBNumarasi(int SVBNumarasi) { this.SVBNumarasi = SVBNumarasi; }
    public String getVaxt() { return Vaxt; }
    public void setVaxt(String Vaxt) { this.Vaxt = Vaxt; }
 
    public Color DurumRengi(String Durum){
        if(Durum.equals("Bos")){
            return Color.GREEN;
        }else if(Durum.equals("Dolu")){
            return Color.RED;
        } else if(Durum.equals("Xarab")){
            return Color.YELLOW;
        }else{
            return new java.awt.Color(0,0,0);
        }
    }
}
