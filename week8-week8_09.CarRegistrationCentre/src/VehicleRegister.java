
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
        if (this.owners.containsKey(plate)) {
            return false;
        }

        this.owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (!this.owners.containsKey(plate)) {
            return false;
        }

        this.owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {

        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
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
