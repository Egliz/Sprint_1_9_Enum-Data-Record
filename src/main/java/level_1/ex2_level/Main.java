package level_1.ex2_level;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(Level.HIGH);
        Task task2 = new Task(Level.MEDIUM);

        task1.showDifficultyLevel();
        task2.showDifficultyLevel();
    }
}
