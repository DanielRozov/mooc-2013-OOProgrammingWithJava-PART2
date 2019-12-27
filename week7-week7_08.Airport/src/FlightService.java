
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightService {

    private Map<String, Integer> planes;
    ArrayList<String> flightPlans;

    public FlightService() {
        this.planes = new HashMap<String, Integer>();
        this.flightPlans = new ArrayList<String>();
    }

    public void addPlane(String string, Integer capacity) {
        String ID = stringCleaner(string);

        if (ID != null && capacity >= 0) {
            if (this.planes.containsKey(ID)) {
                System.out.println("The plane already exist");
            } else {
                this.planes.put(ID, capacity);
            }
        } else {
            System.out.println("The ID cannot be null"
                    + " and the capacity cannot be less than zero.");
        }
    }

    public ArrayList<String> addDepandDestAirportCodes(String string, String dep,
            String dest) {

        String ID = stringCleaner(string);
        String departure = stringCleaner(dep);
        String destination = stringCleaner(dest);

        if (ID != null && departure != null && destination != null) {
            if (this.planes.containsKey(ID)) {
                flightPlans.add(printPlaneInfo(ID) + "( " + departure + " - "
                        + destination + " )");
            }
        }

        return flightPlans;
    }

    public void printPlanes() {
        for (Map.Entry<String, Integer> entry : planes.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + " ppl)");
        }
    }

    public String printFlight(String string) {
        String flight = "";
        String ID = stringCleaner(string);

        if (ID != null) {
            for (String s : flightPlans) {
                if (s.contains(ID)) {
                    flight = s.toString();
                }
            }
        }
        return flight;
    }

    public String printPlaneInfo(String string) {
        String ID = stringCleaner(string);

        if (this.planes.containsKey(ID)) {
            return ID + " (" + this.planes.get(ID) + " ppl)";
        } else {
            return "A plane with this ID does not exist.";
        }
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return null;
        } else {
            return string.toUpperCase().trim();
        }
    }
}
