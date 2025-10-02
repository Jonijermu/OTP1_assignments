import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiceRollerTest {

    private DiceRoller diceRoller;

    @BeforeEach
    public void setUp() {
        diceRoller = new DiceRoller();
    }

    @Test
    public void testRollDie() {
        int result = diceRoller.rollDie();
        assertTrue(result >= 1 && result <= 6, "Die roll should be between 1 and 6");
    }

    @Test
    public void testRollTwoDice() {
        int[] dice = diceRoller.rollTwoDice();
        assertEquals(2, dice.length);
        for (int die : dice) {
            assertTrue(die >= 1 && die <= 6, "Each die should be between 1 and 6");
        }
    }

    @Test
    public void testIsDouble() {
        assertTrue(diceRoller.isDouble(3, 3));
        assertFalse(diceRoller.isDouble(2, 5));
    }

    @Test
    public void testRollsUntilDouble() {
        int rolls = diceRoller.rollsUntilDouble();
        assertTrue(rolls > 0, "Number of rolls should be positive");
    }
}