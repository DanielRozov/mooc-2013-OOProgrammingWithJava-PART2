
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases;
    private int weightLimit;

    public Container(int weightLimit) {
        this.suitcases = new ArrayList<Suitcase>();
        this.weightLimit = weightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= this.weightLimit) {
            suitcases.add(suitcase);
            this.weightLimit -= suitcase.totalWeight();
        }
    }

    public int getSuitcasesTotalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases ("
                + this.getSuitcasesTotalWeight() + " kg)";
    }

}
