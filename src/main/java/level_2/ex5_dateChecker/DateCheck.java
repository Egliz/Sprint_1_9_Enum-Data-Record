package level_2.ex5_dateChecker;

import java.time.LocalDate;

public class DateCheck {

    public static boolean beforeToday(LocalDate date, LocalDate today) {
        return date.isBefore(today);
    }
}
