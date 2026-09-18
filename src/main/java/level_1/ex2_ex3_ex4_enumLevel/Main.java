package level_1.ex2_ex3_ex4_enumLevel;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(Level.HIGH);
        Task task2 = new Task(Level.MEDIUM);

        //Exercise 2
        task1.showDifficultyLevel();
        task2.showDifficultyLevel();

        //Ex3
        System.out.println(Level.LOW.getColor());
        System.out.println(Level.MEDIUM.getColor());
        System.out.println(Level.HIGH.getColor());

        //Ex4
        Level level1 = LevelConverter.stringToEnum("LOW");
        Level level2 = LevelConverter.stringToEnum("HIGH");
        Level invalidLevel = LevelConverter.stringToEnum("INVALID");

        System.out.println(level1);
        System.out.println(level2);
        System.out.println(invalidLevel);



    }
}
