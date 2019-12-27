
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VehicleRegister {

    private Map<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {

        if (this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            return this.owners.get(plate);
        } else {
            return null;
        }
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }

        return false;
    }

    public void printRegistrationPlates() {

        for (Map.Entry<RegistrationPlate, String> entry : this.owners.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public void printOwners() {
        Set<String> onlyOwners = new HashSet<String>();

        for (String owner : this.owners.values()) {
            onlyOwners.add(owner);
        }

        for (String s : onlyOwners) {
            System.out.println(s);
        }
    }
}
