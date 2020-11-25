/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import FrontEnd.OdaElaveEt;
import static FrontEnd.hotbed.Odalar;
import static FrontEnd.hotbed.vaxt;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Acer8
 */
public class Saxla {
    Oda o;
    public javax.swing.JPanel Panel;
    private static int sayac = 0;
    public int Saxlayici = 0;
    
    public void Saxlayici() throws IOException{
        Elaveler.Dosya_yaz_ozel("", "MelumatSaxlayici.hb");
        for (OdaDaxiliMelumat Odalar1 : Odalar) {
            if (Odalar1 != null) {
                String Saxlanilan_melumat = Odalar1.getNomresi() + " " + Odalar1.getOdaIcersindekiOdaSayi() + " " + Odalar1.getIsim() + " " + Odalar1.getSoyIsim() + " " + Odalar1.getDurumu()+ " " + Odalar1.getSVBNumarasi() + "\n"; //Odalar[i].getVaxt()+"\n"; 
                Elaveler.Dosya_yaz("MelumatSaxlayici.hb", Saxlanilan_melumat);
            }
        }
    }
    public void Yukleyici(){
        int osayac = 0;
        // burada saxlayan fayili oxunaraq onun icindekiler bir bir buraya yazilaraq yeni bir oda daxil olunacaq burada bos olub olmadigi yoxlanmalidi 
        //ve birdeki setir setir yazilmalidir 
        Scanner Oxuyan = new Scanner(Elaveler.Dosya_oxu(new File("MelumatSaxlayici.hb")));
        while(Oxuyan.hasNext()){
            osayac++;
            String[] arrOfStr = Oxuyan.nextLine().split(" "); 
            //for (String a : arrOfStr){
                OdaDaxiliMelumat oda = new OdaDaxiliMelumat();
                oda.setNomresi(Integer.parseInt(arrOfStr[0]));
                oda.setReng(oda.DurumRengi(arrOfStr[4]));
                oda.setOdaIcersindekiOdaSayi(Integer.parseInt(arrOfStr[1]));
                oda.setIsim(arrOfStr[2]);
                oda.setSoyIsim(arrOfStr[3]);
                int suvnumarasigecirici = Integer.parseInt(arrOfStr[5]);
                oda.setSVBNumarasi(suvnumarasigecirici);
               // oda.setVaxt(arrOfStr[6]);
                o = new Oda(oda);

                if( sayac == 0 ) { Panel.remove(0); }
                Odalar[sayac] = oda; 
                sayac++;

                Panel.repaint();
                Panel.revalidate();
                Panel.add(o);
                Panel.repaint();
            //} 
        }
        OdaElaveEt.sayac = osayac;
        Saxlayici = sayac;
        //System.out.println(a); 
        
    }
}
