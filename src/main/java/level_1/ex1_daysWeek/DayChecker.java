package level_1.ex1_daysWeek;

public class DayChecker {

    public static void checkDay(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                    System.out.println(day + " is a workday.");

            case SATURDAY, SUNDAY ->
                    System.out.println(day + " is the weekend.");
        }
    }
}
