package level_1.ex1_daysWeek;

public class DayChecker {

    public static void checkDay(Day day) {
        switch (day) {
            case MONDAY -> System.out.println(day + " is a workday.");
            case TUESDAY -> System.out.println(day + " is a workday.");
            case WEDNESDAY -> System.out.println(day + " is a workday.");
            case THURSDAY -> System.out.println(day + " is a workday.");
            case FRIDAY -> System.out.println(day + " is a workday.");
            case SATURDAY -> System.out.println(day + " is the weekend.");
            case SUNDAY -> System.out.println(day + " is the weekend.");
        }
    }
}
