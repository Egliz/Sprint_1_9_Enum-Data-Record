package level_1.ex1_daysWeek;

public enum Day {
    MONDAY("Workday"),
    TUESDAY("Workday"),
    WEDNESDAY("Workday"),
    THURSDAY("Workday"),
    FRIDAY("Workday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String typeOfDay;

    Day(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }
}