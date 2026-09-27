package level_2.ex3_changeDate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @Test
    void addsFiveDaysToDate() {
        LocalDate date = LocalDate.of(2026, 9, 27);

        LocalDate result = date.plusDays(5);

        assertEquals(LocalDate.of(2026, 10, 2), result);
    }

    @Test
    void subtractsDaysFromDate() {
        LocalDate date = LocalDate.of(2026, 9, 27);

        LocalDate result = date.minusDays(5);

        assertEquals(LocalDate.of(2026, 9, 22), result);
    }

}
