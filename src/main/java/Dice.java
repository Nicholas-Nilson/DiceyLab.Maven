public class Dice {
    Integer sides = 6;
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
        Integer noOfPossibleOutcomes = (numberOfDice * sides) - (numberOfDice - 1);
        Integer result = 0;
//        for (int i = 0; i < numberOfDies; i++) {   //I think we can do this without a for loop. Might not be as fun.
//            result = result + (int)(sides * Math.random()) + 1;
//        }
        result = result + (int)(noOfPossibleOutcomes * Math.random() + numberOfDice);
        return result;
    }

}
