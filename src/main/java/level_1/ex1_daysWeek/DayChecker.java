package level_1.ex1_daysWeek;

public class DayChecker {

    public static String checkDay(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                return "Workday";
            }

            case SATURDAY, SUNDAY -> {
                return "Weekend";
            }

            default -> {
                return "Invalid day";
            }
        }
    }
}
