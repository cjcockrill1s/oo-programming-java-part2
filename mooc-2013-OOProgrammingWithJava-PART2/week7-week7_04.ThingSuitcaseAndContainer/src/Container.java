import java.util.ArrayList;
import java.util.List;

public class Container {

    private int maxWeight;
    private List<Suitcase> suitcases = new ArrayList<Suitcase>();

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(suitcase.totalWeight() + totalWeight() > this.maxWeight)) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
}
