package level_2.ex2_differentDate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void calculatesDifferenceBetweenDates() {
        LocalDate start = LocalDate.of(2026, 1, 1);
        LocalDate end = LocalDate.of(2026, 1, 11);

        Period difference = Period.between(start, end);

        assertEquals(10, difference.getDays());
    }
}
