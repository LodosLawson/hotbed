/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Acer8
 */
public class Elaveler {
    
    public static void Yazdir(String Melumat) { System.out.println(""+Melumat); }
    
    public static String Dosya_oxu(File Dosya_yolu){
        String Geri_Dondurulecek;
        File Dosya_Ac	= Dosya_yolu;
	FileReader Dosya_oxuyar = null;
	try { Dosya_oxuyar = new FileReader(Dosya_Ac); } catch (FileNotFoundException e1) { e1.printStackTrace(); } 
	char[] String_Donusdurucu = new char[(int) Dosya_Ac.length()];
	try { Dosya_oxuyar.read(String_Donusdurucu); Dosya_oxuyar.close(); } catch (IOException e ) { Yazdir("\n PROBLEM VAR <<< Dosya_oxu.Elaveler XETA "); }	
	Geri_Dondurulecek = new String(String_Donusdurucu);
    	return Geri_Dondurulecek;
    }
    public static void Dosya_yaz(String Dosya_yolu, String Melumat) throws IOException{
        BufferedWriter Yazici = null;
	try { Yazici = new BufferedWriter(new FileWriter(Dosya_yolu, true)); } catch (IOException e) { Yazdir("\n PROBLEM VAR <<< Dosya_yaz.Elaveler XETA "); }
	Yazici.write(Melumat);   		     
	Yazici.close();
    }
    public static void Dosya_yaz_ozel(String Melumat, String Dosya_yolu) throws IOException{
        BufferedWriter Yazici = null;
	try { Yazici = new BufferedWriter(new FileWriter(Dosya_yolu)); } catch (IOException e) { Yazdir("\n PROBLEM VAR <<< Dosya_yaz.Elaveler XETA "); }
	Yazici.write(Melumat);   		     
	Yazici.close();
    }
}
