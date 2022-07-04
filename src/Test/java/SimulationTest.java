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
    public void testPrintResults() {
        //Given
        String expected = " ***\n"+
                            "Simulation of 2 dice tossed for 1000000 times.\n"+
                            "***\n\n"+

        "2:     27848: 0.03 ***\n"+
        "3:     55286: 0.06 ******\n"+
        "4:     83432: 0.08 ********\n"+
        "5:    110740: 0.11 ***********\n"+
        "6:    138915: 0.14 **************\n"+
        "7:    166833: 0.17 *****************\n"+
        "8:    139399: 0.14 **************\n"+
        "9:    110417: 0.11 ***********\n"+
        "10:     82971: 0.08 ********\n"+
        "11:     56104: 0.06 ******\n"+
        "12:     28055: 0.03 ***\n";
        //When
        Simulation testSim = new Simulation(2, 100000);
        testSim.rolls.results[0] = 27848;
        testSim.rolls.results[1] = 55286;
        testSim.rolls.results[2] = 83432;
        testSim.rolls.results[3] = 110740;
        testSim.rolls.results[4] = 138915;
        testSim.rolls.results[5] = 166833;
        testSim.rolls.results[6] = 139399;
        testSim.rolls.results[7] = 110417;
        testSim.rolls.results[8] = 82971;
        testSim.rolls.results[9] = 56104;
        testSim.rolls.results[10] = 28055;
        testSim.printResults();
        //Then
        String actual = testSim.printResults().toString();
        Assertions.assertArrayEquals(expected, actual);
    }


}