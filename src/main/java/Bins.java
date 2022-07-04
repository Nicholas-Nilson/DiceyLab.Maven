
public class Bins {

    int[] results;
    Integer numberOfDice;

    public Bins(Integer numberOfDies, Integer noOfOutcomes) {
        Integer arraySize = noOfOutcomes;
        this.results = new int[arraySize];
        this.numberOfDice = numberOfDies;
    }

    public Integer getBin (Integer rollToGetResultsFor) {
        Integer index = rollToGetResultsFor - numberOfDice; //may put this line in Simulation.
        return results[index];
    }

    public void incrementBin(Integer indexToIncrement) {
        Integer index = indexToIncrement;
        results[index] += 1;
    }

}
