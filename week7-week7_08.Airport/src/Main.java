
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        String input = "1\n"
                + "AY-123\n"
                + "108\n"
                + "1\n"
                + "DE-213\n"
                + "75\n"
                + "x\n"
                + "1\n"
                + "x";

        FlightService fs = new FlightService();
        Scanner reader = new Scanner(input);

        AirportPanel panel = new AirportPanel(reader, fs);
        panel.start();
    }
}
