package level_2.ex6_agenda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;


public class AgendaTest {

    @Test
    void appointmentDateCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
                Agenda.addAppointment(null, "Dentist"));
    }

    @Test
    void serviceCannotBeNull() {
        LocalDateTime date = LocalDateTime.of(2026, 10, 2, 15, 30);

        assertThrows(IllegalArgumentException.class, () ->
                Agenda.addAppointment(date, null));
    }

    @Test
    void addAppointment() {
        LocalDateTime date = LocalDateTime.of(2026, 10, 2, 15, 30);

        Agenda.addAppointment(date, "Dentist");
        assertEquals("Dentist", Agenda.appointments.get(date));
    }
}