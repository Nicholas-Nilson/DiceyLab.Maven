import java.util.Arrays;

public class Simulation {

    Integer numberOfSides;
    Integer numberOfDice;
    Integer numberOfRolls;
    Integer noOfPossibleOutcomes;
    Bins rolls;

    //For standard 6-sided dice.
    public Simulation(Integer numberOfDice, Integer numberOfRolls) {
        this.numberOfSides = 6;
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
        this.noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice - 1);
        rolls = new Bins(numberOfDice, noOfPossibleOutcomes);
    }

    //Just have a good time. Should probably implement a check for number of sides. 3-sided die are abominations,
    //but sides should at least be four, and not so many sides * rolls that it melts this nice MacBook.
    public Simulation(Integer numberOfSides, Integer numberOfDice, Integer numberOfRolls) {
        this.numberOfSides = numberOfSides;
        this.numberOfDice = numberOfDice;
        this.numberOfRolls  = numberOfRolls;
        this.noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice - 1);
//        results = new Bins(numberOfDice, noOfPossibleOutcomes);
    }

    public void runSimulation() {
//        Integer noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice -1);
        rolls = new Bins(numberOfDice, noOfPossibleOutcomes);
        Dice dice = new Dice(numberOfSides, numberOfDice);
        for (int i = 0; i < numberOfRolls; i++) {
            int indexOfNumToIncrement = dice.tossAndSum() - numberOfDice;
            rolls.incrementBin(indexOfNumToIncrement);
        }
    }

    public Double[] getPercentages() {
        Double[] percentResults = new Double[rolls.results.length];
        for (int i = 0; i < rolls.results.length; i++) {
            Double rollResult = (double)(rolls.results[i]);
            Double rollNumbers = (double)(numberOfRolls);
            Double percentTimesRolled = (rollResult / rollNumbers);
            percentTimesRolled = (double)Math.round(percentTimesRolled * 100)/100;
            percentResults[i] = percentTimesRolled;
            System.out.println(percentResults[i]);
        }
        return percentResults;
    }

//    public void printResults() { //holy formatting, Batman!
//        System.out.println("***");
//        System.out.printf("Simulation of %d dice tossed for %d.\n", numberOfDice, numberOfRolls);
//        System.out.println("***");
//
//        }

    }
