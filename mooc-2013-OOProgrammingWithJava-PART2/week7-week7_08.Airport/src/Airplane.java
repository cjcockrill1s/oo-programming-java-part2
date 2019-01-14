import java.util.HashMap;

public class Airplane {

    private HashMap<String, Integer> airplane;

    public Airplane() {
        this.airplane = new HashMap<String, Integer>();
    }

    public void addPlane(String name, Integer capacity) {
        this.airplane.put(name, capacity);
    }

    public String toString() {
        String result = "";
        for (String name : this.airplane.keySet()) {
            result += name + " (" + getCapacity(name) + " ppl)\n";
        }
        return result;
    }

    public Integer getCapacity(String name) {
        return this.airplane.get(name);
    }

    public String get(String name) {
        return name + " (" + getCapacity(name) + " ppl)";
    }
}
