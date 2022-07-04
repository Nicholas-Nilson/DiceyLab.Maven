public class Dice {
    Integer sides;
    Integer numberOfDice;

    public Dice(Integer numberOfDies) {
        this.numberOfDice = numberOfDies;
        this.sides = 6;
    }

    public Dice(Integer numberOfSidesPerDie, Integer numberOfDies) {
        this.numberOfDice = numberOfDies;
        this.sides = numberOfSidesPerDie;
    }

    public Integer tossAndSum () {
        Integer result = 0;
        for (int i = 0; i < numberOfDice; i++) {   //I think we can do this without a for loop. Might not be as fun. -_- see below //line.
            result = result + (int)(sides * Math.random()) + 1;
        }
//        result = result + (int)(noOfPossibleOutcomes * Math.random() + numberOfDice); //this way looks nice, but doesn't work properly (all roll probabilities are the same).
        return result;
    }

}
