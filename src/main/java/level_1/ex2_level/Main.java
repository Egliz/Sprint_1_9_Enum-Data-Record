package level_1.ex2_level;

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


    }
}
