package level_2.ex4_changeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println(dateNow.format(format1));
        System.out.println(dateNow.format(format2));
        System.out.println(dateNow.format(format3));
    }
}
