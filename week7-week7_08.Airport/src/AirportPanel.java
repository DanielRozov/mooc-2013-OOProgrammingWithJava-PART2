
import java.util.Scanner;

public class AirportPanel {

    private Scanner reader;
    private FlightService flightService;

    public AirportPanel(Scanner reader, FlightService flightService) {
        this.reader = reader;
        this.flightService = flightService;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("-------------------- \n");

        while (true) {
            System.out.println("Choose operation: \n"
                    + "[1] Add airplane \n"
                    + "[2] Add flight \n"
                    + "[x] Exit");

            String operation = this.reader.nextLine();

            if (operation.toLowerCase().equals("x")) {
                flightService();
                break;
            }

            operationHandlingforPlaneAndFlights(operation);
        }
    }

    private void operationHandlingforPlaneAndFlights(String operation) {
        if (operation.equals("1")) {
            addAirplane();
        } else if (operation.equals("2")) {
            addFlight();
        }
    }

    private void addAirplane() {
        System.out.println("Give plane ID:");
        String planeID = this.reader.nextLine();
        System.out.println("Give plane capacity:");
        Integer capacity = Integer.parseInt(this.reader.nextLine());

        this.flightService.addPlane(planeID, capacity);
    }

    private void addFlight() {
        System.out.println("Give plane ID:");
        String planeID = this.reader.nextLine();;
        System.out.println("Give departure airport code:");
        String dep = this.reader.nextLine();
        System.out.println("Give destination airport code:");
        String dest = this.reader.nextLine();

        this.flightService.addDepandDestAirportCodes(planeID, dep, dest);
    }

    public void flightService() {
        System.out.println("Flight service\n"
                + "------------");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");

            String operation = this.reader.nextLine();

            if (operation.toLowerCase().equals("x")) {
                break;
            }

            operationHandlingForFlightService(operation);
        }

    }

    private void operationHandlingForFlightService(String operation) {
        if (operation.equals("1")) {
            this.flightService.printPlanes();
        } else if (operation.equals("2")) {
            this.flightService.printFlights();
        } else if (operation.equals("3")) {
            System.out.println("Give plane ID:");
            String planeID = this.reader.nextLine();
            System.out.println(this.flightService.printPlane(planeID));
        }
    }
}
