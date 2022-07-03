public class MainApplication {

    public static void main(String args[]) {
        Simulation sim1 = new Simulation(2, 100);
        sim1.runSimulation();
        sim1.printResults();
    }
}
