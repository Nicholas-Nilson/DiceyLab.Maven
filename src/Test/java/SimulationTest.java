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
}