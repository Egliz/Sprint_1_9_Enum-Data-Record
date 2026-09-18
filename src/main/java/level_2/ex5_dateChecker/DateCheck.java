package level_2.ex5_dateChecker;

import java.time.LocalDate;

public class DateCheck {

    public static boolean beforeToday(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }
}
