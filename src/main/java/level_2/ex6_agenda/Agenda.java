package level_2.ex6_agenda;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Agenda {

    static HashMap<LocalDateTime, String> appointments = new HashMap<>();

    public static void addAppointment(LocalDateTime dateTime, String service ){
        appointments.put(dateTime, service);
    }

    public static void showUpcomingAppointment() {
        appointments.entrySet().stream().filter(a -> a.getKey().isAfter(LocalDateTime.now()))
                .forEach(a -> System.out.println(a.getKey() + " - " + a.getValue()));
    }
}