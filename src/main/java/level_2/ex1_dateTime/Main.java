package level_2.ex1_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //TODO Explicar modulacion/especificar en los commits la separacion de paquetes
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + dateNow);
        System.out.println("Time: " + timeNow);
        System.out.println("Date and time now: " + dateTime);
    }
}
