package level_1.ex2_ex3_enumLevel;
//Ex4
public class LevelConverter {

    public static Level stringToEnum(String value) {
        try {
            return Level.valueOf(value);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid level: " + value);
            return null;
        }
    }
}
