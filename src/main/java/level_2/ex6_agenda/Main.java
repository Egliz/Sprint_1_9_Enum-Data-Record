package level_2.ex6_agenda;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.of(2026, 11, 2, 10, 20);
        LocalDateTime date2 = LocalDateTime.of(2026, 10, 2, 15, 30);
        LocalDateTime date3 = LocalDateTime.of(2026, 9, 29, 17, 15);
        LocalDateTime date4 = LocalDateTime.of(2026, 9, 30, 11, 45);

        Agenda.addAppointment(date1, "Dentist");
        Agenda.addAppointment(date2, "Hairdresser");
        Agenda.addAppointment(date3, "Meeting");
        Agenda.addAppointment(date4, "Optician");
        System.out.println("Scheduled appointments.");

        Agenda.showAppointment();
    }
}