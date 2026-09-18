package level_1.ex2_ex3_ex4_enumLevel;

public class Main {
    public static void main(String[] args) {


        Task task1 = new Task(Level.HIGH);
        Task task2 = new Task(Level.MEDIUM);

        System.out.println("Ex2");
        task1.showDifficultyLevel();
        task2.showDifficultyLevel();

        System.out.println( "\nEx3: \n" + Level.LOW.getColor() + "\n" +
                Level.MEDIUM.getColor() + "\n"
                + Level.HIGH.getColor());

        System.out.println("\nEx4");
        Level level1 = LevelConverter.stringToEnum("LOW");
        Level level2 = LevelConverter.stringToEnum("HIGH");
        Level invalidLevel = LevelConverter.stringToEnum("INVALID");

        System.out.println(level1 + "\n" + level2 + "\n" + invalidLevel);



    }
}
