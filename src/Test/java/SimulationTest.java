import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SimulationTest {

    @Test
    public void testGetStars() {
        //Given
        String expected = "*****";
        //When
        Simulation testSim = new Simulation(1, 3);
        Double percentToReturn = 0.05;
        //Then
        String actual = testSim.getStars(percentToReturn);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetStars2() {
        //Given
        String expected = "**********";
        //When
        Simulation testSim = new Simulation(1, 3);
        Double percentToReturn = 0.10;
        //Then
        String actual = testSim.getStars(percentToReturn);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetPercentages1() {
        //Given
        Double[] expected = {.1, .0, .0, .2, .3, .2, .0, .1, .1, .0, .0};
        //When
        Simulation testSim = new Simulation(2, 10);
        testSim.rolls.results[0] = 1;
        testSim.rolls.results[1] = 0;
        testSim.rolls.results[2] = 0;
        testSim.rolls.results[3] = 2;
        testSim.rolls.results[4] = 3;
        testSim.rolls.results[5] = 2;
        testSim.rolls.results[6] = 0;
        testSim.rolls.results[7] = 1;
        testSim.rolls.results[8] = 1;
        testSim.rolls.results[9] = 0;
        testSim.rolls.results[10] = 0;
        testSim.getPercentages();
        //Then
        Double[] actual = testSim.percentResults;
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetPercentages2() {
        //Given
        Double[] expected = {.03, .06, .08, .11, .14, .17, .14, .11, .08, .06, .03};
        //When
        Simulation testSim = new Simulation(2, 100);
        testSim.rolls.results[0] = 3;
        testSim.rolls.results[1] = 6;
        testSim.rolls.results[2] = 8;
        testSim.rolls.results[3] = 11;
        testSim.rolls.results[4] = 14;
        testSim.rolls.results[5] = 17;
        testSim.rolls.results[6] = 14;
        testSim.rolls.results[7] = 11;
        testSim.rolls.results[8] = 8;
        testSim.rolls.results[9] = 6;
        testSim.rolls.results[10] = 3;
        testSim.getPercentages();
        //Then
        Double[] actual = testSim.percentResults;
        Assertions.assertArrayEquals(expected, actual);
    }


}