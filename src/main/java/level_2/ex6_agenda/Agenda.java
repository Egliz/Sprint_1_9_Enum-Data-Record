package level_2.ex6_agenda;

import java.time.LocalDateTime;
import java.util.HashMap;


public class Agenda {

    static HashMap<LocalDateTime, String> appointments = new HashMap<>();

    public static void addAppointment(LocalDateTime dateTime, String service ){
        appointments.put(dateTime, service);
    }


    }

    //un metodo que muestre las proximas