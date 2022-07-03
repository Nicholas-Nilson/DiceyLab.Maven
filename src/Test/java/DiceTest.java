import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiceTest {

    @Test  //this may be completely unnecessary.
    public void testTossAndSum() {
        // Given
        Integer minRoll = 1;
        Integer maxRoll = 6;
        // When
        Dice dice = new Dice(1);
        // Then
        boolean actual;
        Integer actualRoll = dice.tossAndSum();
        if (minRoll <= actualRoll && actualRoll <= maxRoll) {
            actual = true;
        } else { actual = false;}
        System.out.println(actualRoll);
        Assertions.assertTrue(actual);
    }
}