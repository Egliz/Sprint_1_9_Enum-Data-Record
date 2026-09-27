package level_2.ex5_dateChecker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025, 1, 1);
        LocalDate today = LocalDate.of(2026, 12, 27);
        System.out.println(DateCheck.beforeToday(date, today));
    }
}
