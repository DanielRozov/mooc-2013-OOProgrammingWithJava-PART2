
import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> promissoryNote;

    public PromissoryNote() {
        this.promissoryNote = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        String name = stringCleaner(toWhom);

        if (this.promissoryNote.containsKey(name)) {
            System.out.println("The customer is already exist!");
        } else {
            this.promissoryNote.put(name, value);
        }
    }

    public double howMuchIsTheDebt(String whose) {
        String name = stringCleaner(whose);

        if (this.promissoryNote.containsKey(name)) {
            return this.promissoryNote.get(name);
        } else {
            return 0;
        }
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        return string.toLowerCase().trim();
    }
}
