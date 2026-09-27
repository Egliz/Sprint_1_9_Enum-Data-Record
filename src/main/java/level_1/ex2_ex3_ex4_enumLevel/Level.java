package level_1.ex2_ex3_ex4_enumLevel;

public enum Level {
    LOW(1, "Green"),
    MEDIUM(3, "Yellow"),
    HIGH(5, "Red");

    private int difficulty;
    private final String color;

    Level(int difficulty, String color) {
        this.difficulty = difficulty;
        this.color = color;
    }

    public int getDifficulty(){
        return this.difficulty;
    }
    public String getColor() {
        return this.color;
    }

}
