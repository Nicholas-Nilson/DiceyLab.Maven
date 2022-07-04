
public class Simulation {

    Integer numberOfSides;
    Integer numberOfDice;
    Integer numberOfRolls;
    Integer noOfPossibleOutcomes;
    Bins rolls;
    Double[] percentResults;
    String results = "";

    //For standard 6-sided dice.
    public Simulation(Integer numberOfDice, Integer numberOfRolls) {
        this.numberOfSides = 6;
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
        this.noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice - 1);
        rolls = new Bins(numberOfDice, noOfPossibleOutcomes);
    }

    //Just to have a good time. Should probably implement a check for number of sides x number of dice. 3-sided dice are abominations,
    //but sides should at least be four, and not so many sides * dice that it melts this nice MacBook.
    public Simulation(Integer numberOfSides, Integer numberOfDice, Integer numberOfRolls) {
        this.numberOfSides = numberOfSides;
        this.numberOfDice = numberOfDice;
        this.numberOfRolls  = numberOfRolls;
        this.noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice - 1);
        rolls = new Bins(numberOfDice, noOfPossibleOutcomes);
    }

    public void runSimulation() {
//        Integer noOfPossibleOutcomes = (numberOfDice * numberOfSides) - (numberOfDice -1);
        Dice dice = new Dice(numberOfSides, numberOfDice);
        for (int i = 0; i < numberOfRolls; i++) {
            int indexOfNumToIncrement = dice.tossAndSum() - numberOfDice;
            rolls.incrementBin(indexOfNumToIncrement);
        }
    }

    public Double[] getPercentages() {
        this.percentResults = new Double[rolls.results.length];
        for (int i = 0; i < rolls.results.length; i++) {
            Double rollResult = (double)(rolls.results[i]);
            Double rollNumbers = (double)(numberOfRolls);
            Double percentTimesRolled = (rollResult / rollNumbers);
            percentTimesRolled = (double)Math.round(percentTimesRolled * 100)/100;
            percentResults[i] = percentTimesRolled;
        }
        return percentResults;
    }

    public String getStars(Double percentToPrint) {
        String row ="";
        char star = '*';
        int numberOfStars = (int)(percentToPrint * 100);
        for (int i =0; i < numberOfStars; i++) {
            row = row + star;
        }
        return row;
    }


    public String printResults() { //holy formatting, Batman!

        getPercentages();
        this.results = "***\n" +
                        String.format("Simulation of %d dice tossed for %d times.\n", numberOfDice, numberOfRolls) +
                        "***\n\n";
            for(int i = 0; i < percentResults.length; i++){
                        results = results + String.format("%3d: %9d: %.2f %s\n", numberOfDice+i, rolls.getBin(i+numberOfDice), percentResults[i], getStars(percentResults[i]));
        }
        System.out.println(results);
        return results;
    }


    //original format for print results.

    //    public void printResults() { //holy formatting, Batman!
//        //int valueOfLargestBin = 0;  //well this was a wonderful way to spend my time... have to figure out how to determine field size of timesRolled.
//        //for (int i = 0; i < rolls.results.length; i++) {  //to use this how I was thinking I'd need another 'getStars' type for loop. but that
//           // if (valueOfLargestBin < rolls.results[i]) {  //needlessly convolutes the code when I can just set the field
//             //   valueOfLargestBin = rolls.results[i];   //only issue is if #of times rolled exceeds the set 9 digit field.
//           // }
//       // }
//       // String largestBin = String.valueOf(valueOfLargestBin);
//       // int timesRolledField = largestBin.length();

//        getPercentages();
//        System.out.println("***");
//        System.out.printf("Simulation of %d dice tossed for %d times.\n", numberOfDice, numberOfRolls);
//        System.out.println("***\n");
//        for(int i = 0; i < percentResults.length; i++) {
//            System.out.printf("%3d: %9d: %.2f %s\n", numberOfDice+i, rolls.getBin(i+numberOfDice), percentResults[i], getStars(percentResults[i]));
//        }
//        }

    }
