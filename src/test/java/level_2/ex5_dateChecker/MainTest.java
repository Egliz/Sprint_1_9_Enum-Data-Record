package level_2.ex5_dateChecker;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void dateIsAfterToday() {
        LocalDate date = LocalDate.of(2026, 10, 1);
        LocalDate today = LocalDate.of(2026, 9, 22);

        assertFalse(DateCheck.beforeToday(date, today));
    }

    @Test
    void dateIsNotBeforeTodayWhenDatesAreEqual() {
        LocalDate date = LocalDate.of(2026, 9, 27);
        LocalDate today = LocalDate.of(2026, 9, 27);

        assertFalse(DateCheck.beforeToday(date, today));
    }

}
