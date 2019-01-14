import java.util.HashMap;
import java.util.Scanner;

public class AirportUserInterface {

    private Scanner reader;
    private Airplane airplane;
    private Flight flight;

    public AirportUserInterface (Scanner reader, Airplane airplane, Flight flight) {
        this.reader = reader;
        this.airplane = airplane;
        this.flight = flight;
    }

    public void start() {
        getAirportInput();
        getFlightsInput();
    }

    public void getAirportInput() {
        System.out.println("Airport panel\n" +
            "--------------------\n");
        while (true) {
            printAirportOptions();
            String action = reader.nextLine();
            if (action.equals("1")) {
                addAirplane();
            } else if (action.equals("2")) {
                addFlight();
            } else if (action.equals("x")) {
                break;
            }
        }
    }

    public void printAirportOptions() {
        System.out.println("Choose operation:\n" +
                "[1] Add airplane\n" +
                "[2] Add flight\n" +
                "[x] Exit\n" +
                "> ");
    }

    public void addAirplane() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println("Give plane capacity: ");
        Integer capacity = Integer.parseInt(reader.nextLine());
        this.airplane.addPlane(id, capacity);
    }

    public void addFlight() {
        System.out.println("Give plane ID: ");
        String airplane = reader.nextLine();
        System.out.println("Give departure airport code: ");
        String departureCode = reader.nextLine();
        System.out.println("Give destination airport code: BAL");
        String destinationCode = reader.nextLine();

        this.flight.add(this.airplane.get(airplane) + " (" + departureCode + "-" +destinationCode + ")\n");
    }

    public void getFlightsInput() {
        System.out.println("Flight service\n" +
                "------------\n");
        while (true) {
            printFlightsOptions();
            String action = reader.nextLine();
            if(action.equals("1")) {
                System.out.println(this.airplane.toString());
            } else if (action.equals("2")) {
                System.out.println(this.flight.toString());
            } else if (action.equals("3")) {
                System.out.println("Give plane ID: ");
                String name = reader.nextLine();
                System.out.println(this.airplane.get(name));
            } else if (action.equals("x")) {
                break;
            }
        }
    }

    public void printFlightsOptions() {
        System.out.println("Choose operation:\n" +
                "[1] Print planes\n" +
                "[2] Print flights\n" +
                "[3] Print plane info\n" +
                "[x] Quit\n" +
                "> ");
    }

}
