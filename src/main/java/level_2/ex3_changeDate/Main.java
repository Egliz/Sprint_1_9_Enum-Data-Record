package level_2.ex3_changeDate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();

        LocalDate datePlusDays = dateNow.plusDays(8);
        LocalDate dateMinusMonths = dateNow.minusMonths(5);

        System.out.println("Date now: " + dateNow + " Date plus 8 days: "
                + datePlusDays + ". Date minus 5 months: " + dateMinusMonths);

    }
}
