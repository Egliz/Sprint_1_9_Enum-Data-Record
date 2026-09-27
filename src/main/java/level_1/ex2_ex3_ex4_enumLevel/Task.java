package level_1.ex2_ex3_ex4_enumLevel;
//Ex2
public class Task {

    private final Level level;

    public Task(Level level) {
        this.level = level;
    }

    public void showDifficultyLevel() {
            System.out.println("Difficulty level: " + level.getDifficulty() + "/5");
    }
}
