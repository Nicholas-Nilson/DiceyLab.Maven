import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DiceTest {

    @Test  //this may be completely unnecessary. or done completely wrong.
    public void testTossAndSum1() {
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

    @Test
    public void testTossAndSum2() {
        // Given
        Integer minRoll =4;
        Integer maxRoll = 80;
        // When
        Dice dice = new Dice(20, 4);
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