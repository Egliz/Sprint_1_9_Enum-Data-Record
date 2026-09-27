package level_2.ex4_changeFormat;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void formatsDate() {
        LocalDate date = LocalDate.of(2026, 2, 7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        assertEquals("07/02/2026", date.format(formatter));
    }
}
