package BackEnd;

//Test Text

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        System.out.println("salam dunya ");
        LocalDateTime timePoint = LocalDateTime.now(
        );     // The current date and time
        System.out.println(LocalDate.of(2020, Month.DECEMBER, 12)); // from values
        System.out.println(LocalDate.ofEpochDay(150));  // middle of 1970
        System.out.println(LocalTime.of(17, 18)); // the train I took home today
        System.out.println(LocalTime.parse("10:15:30")); // From a String
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  //("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));  
    }
}
