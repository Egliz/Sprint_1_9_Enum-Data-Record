package level_1.ex2_ex3_ex4_enumLevel;

public enum Level {
    LOW("Green"),
    MEDIUM("Yellow"),
    HIGH("Red");

    private String color;

    //Ex3
    Level(String color) {
        this.color = color;

    }

    //Ex3
    public String getColor() {
        return color;
    }

}
