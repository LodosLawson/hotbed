/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Acer8
 */
public class TarixVaxt {
    public String getTarix(){
        DateTimeFormatter Data = DateTimeFormatter.ofPattern("yyyy/MM/dd");  //("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        return Data.format(now);
    }
}
