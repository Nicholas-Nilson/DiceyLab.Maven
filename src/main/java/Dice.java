public class Dice {

    Integer sides = 6;
    Integer numberOfDice;

    public Dice(Integer numberOfDies) {
        this.numberOfDice = numberOfDies;
    }
    public Integer tossAndSum (Integer numberOfDies) {
        Integer result = 0;
        for (int i = 0; i < numberOfDies; i++) {
            result = (int)(sides * Math.random()) + 1;
        }
        return result;
    }

}
