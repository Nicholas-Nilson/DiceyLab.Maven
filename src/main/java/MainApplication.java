import java.util.Arrays;

public class MainApplication {

    public static void main(String args[]) {
        Simulation sim1 = new Simulation(2, 1000000);
        sim1.runSimulation();
        sim1.printResults();
    }
}
