
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        FlightService fs = new FlightService();
        Scanner reader = new Scanner(System.in);
        AirportPanel panel = new AirportPanel(reader, fs);
        
        panel.addPlaneAndFlight();
    }
}
