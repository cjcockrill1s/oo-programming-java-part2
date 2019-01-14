import java.util.ArrayList;

public class Flight {

    private ArrayList<String> flight;


    public Flight() {
        this.flight = new ArrayList<String>();
    }

    public void add(String route) {
        this.flight.add(route);
    }

    public String toString() {
        String result = "";
        for (String route : flight) {
            result += route + "\n";
        }
        return result;
    }

}
