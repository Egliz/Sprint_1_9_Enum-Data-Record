package level_1.ex2_level;
//Ex2
public class Task {

    private Level level;

    public Task(Level level) {
        this.level = level;
    }

    public void showDifficultyLevel() {
        System.out.print("Difficulty level: ");
        switch (level) {
            case HIGH -> System.out.println("5/5");
            case MEDIUM -> System.out.println("3/5");
            case LOW ->System.out.println("1/5");
        }
    }
}
