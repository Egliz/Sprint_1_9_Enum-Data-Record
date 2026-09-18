package level_2.ex2_differentDate;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2026, 1, 1);
        LocalDate date2 = LocalDate.now();
        Period difference = Period.between(date1, date2);

        System.out.println(difference.getYears() + " years. " + difference.getMonths() + " months and " + difference.getDays() + "days.");

    }
}
