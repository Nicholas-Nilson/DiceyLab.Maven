import java.util.Arrays;

public class Simulation {

    Integer numberOfSides;
    Integer numberOfDice;
    Integer numberOfRolls;
    Bins results;

    //For standard 6-sided dice.
    public Simulation(Integer numberOfDice, Integer numberOfRolls) {
        this.numberOfSides = 6;
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
        Integer noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice - 1);
        results = new Bins(numberOfDice, noOfPossibleOutcomes);
    }

    //Just have a good time. Should probably implement a check for number of sides. 3-sided die are abominations,
    //but sides should at least be four, and not so many sides * rolls that it melts this nice MacBook.
    public Simulation(Integer numberOfSides, Integer numberOfDice, Integer numberOfRolls) {
        this.numberOfSides = numberOfSides;
        this.numberOfDice = numberOfDice;
        this.numberOfRolls  = numberOfRolls;
        Integer noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice - 1);
        results = new Bins(numberOfDice, noOfPossibleOutcomes);
    }

    public void runSimulation() {
//        Integer noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice -1);
        Dice dice = new Dice(numberOfSides, numberOfDice);
        for (int i = 0; i < numberOfRolls; i++) {
            int numToIncrement = dice.tossAndSum() - numberOfDice;
            results.incrementBin(numToIncrement);
        }
    }

    public void printResults() { //hmmmm this doesn't look quite right.
        results.toString();  //let's use get bin here.
    }



}
