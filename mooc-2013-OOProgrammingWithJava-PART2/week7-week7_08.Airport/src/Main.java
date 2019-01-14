import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Airplane planes = new Airplane();
        Flight flight = new Flight();

        AirportUserInterface ui = new AirportUserInterface(reader, planes, flight);
        ui.start();

    }
}
