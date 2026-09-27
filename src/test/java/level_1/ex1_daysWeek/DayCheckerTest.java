package level_1.ex1_daysWeek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DayCheckerTest {

    @Test
    void mondayIsWorkday() {
        assertEquals("Workday", DayChecker.checkDay(Day.MONDAY));
    }

    @Test
    void sundayIsWeekend() {
        assertEquals("Weekend", DayChecker.checkDay(Day.SUNDAY));
    }
}
