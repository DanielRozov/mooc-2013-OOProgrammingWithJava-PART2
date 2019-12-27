
import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        boolean isMaxWeight = isMaxWeight(this.things, thing);

        if (isMaxWeight) {
            this.things.add(thing);
        }
    }

    // helper method 
    private boolean isMaxWeight(ArrayList<ToBeStored> things,
            ToBeStored thing) {
        double totalWeight = weight() + thing.weight();

        if (totalWeight <= this.maxWeight) {
            return true;
        }

        return false;
    }

    public double weight() {
        double weight = 0.;

        for (ToBeStored thing : things) {
            weight += thing.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight "
                + weight() + " kg";
    }

}
