package level_1.ex2_ex3_ex4_enumLevel;

public enum Level {
    LOW("Green"),
    MEDIUM("Yellow"),
    HIGH("Red");

    private String color;
    //TODO inmutable

    Level(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
