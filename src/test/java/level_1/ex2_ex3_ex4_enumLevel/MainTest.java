package level_1.ex2_ex3_ex4_enumLevel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void lowLevelHasDifficultyOne() {
        assertEquals(1, Level.LOW.getDifficulty());
    }

    @Test
    void highLevelHasDifficultyFive() {
        assertEquals(5, Level.HIGH.getDifficulty());
    }

    @Test
    void highLevelHasRedColor() {
        assertEquals("Red", Level.HIGH.getColor());
    }

    @Test
    void lowLevelHasGreenColor() {
        assertEquals("Green", Level.LOW.getColor());
    }

    @Test
    void convertsStringToLevel() {
        assertEquals(Level.HIGH, LevelConverter.stringToEnum("HIGH"));
    }
}
