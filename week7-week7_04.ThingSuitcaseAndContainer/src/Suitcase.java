
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (!thing.equals(null) && (thing.getWeight()
                <= this.maxWeight)) {
            things.add(thing);
            this.maxWeight -= thing.getWeight();
        }
    }

    // helper method for counting total weight
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = null;

        //find heaviest weight
        for (Thing thing : this.things) {
            if (heaviest == null
                    || heaviest.getWeight() < thing.getWeight()) {
                heaviest = thing;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        if (things.size() == 0) {
            return "empty (" + totalWeight() + " kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + totalWeight() + " kg)";
        }
        return things.size() + " things (" + totalWeight() + " kg)";
    }
}
