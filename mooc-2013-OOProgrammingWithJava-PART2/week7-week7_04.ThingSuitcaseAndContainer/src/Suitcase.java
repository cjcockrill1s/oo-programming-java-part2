import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Suitcase {

    private int maxWeight;
    private List<Thing> suitcaseOfThings = new ArrayList<Thing>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (!(totalWeight() + thing.getWeight() > this.maxWeight)) {
            this.suitcaseOfThings.add(thing);
        };
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : this.suitcaseOfThings) {
            weight += thing.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return countItems() + " (" + totalWeight() + " kg)";
    }

    public void printThings() {
        for (Thing thing : this.suitcaseOfThings) {
            System.out.println(thing.toString());
        }
    }
    private String countItems() {
        String result = "";
        if (this.suitcaseOfThings.size() == 0) {
            result = "empty";
        } else if (this.suitcaseOfThings.size() == 1) {
            result = "1 thing";
        } else {
            result = this.suitcaseOfThings.size() + " things";
        }
        return result;
    }

    public Thing heaviestThing() {
        int heaviest = 0;
        Thing result = null;
        for (Thing thing : this.suitcaseOfThings) {
           if (thing.getWeight() > heaviest) {
               heaviest = thing.getWeight();
               result = thing;
           }
       }
       return result;
    }

}
