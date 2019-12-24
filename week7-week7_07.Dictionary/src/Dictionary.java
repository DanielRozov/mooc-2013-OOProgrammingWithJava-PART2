
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        String cleanedWord = stringCleaner(word);

        if (this.dictionary.containsKey(cleanedWord)) {
            System.out.println("The word already exist in dictionary!");
        } else {
            this.dictionary.put(cleanedWord, translation);
        }
    }

    public String translate(String word) {
        String cleanedWord = stringCleaner(word);

        if (this.dictionary.containsKey(cleanedWord)) {
            return this.dictionary.get(cleanedWord);
        } else {
            return null;
        }
    }

    public int amountOfWords() {
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();

        for (String word : this.dictionary.keySet()) {
            String translation = this.dictionary.get(word);
            translationList.add(word + " = " + translation);
        }

        return translationList;
    }

    private String stringCleaner(String string) {

        if (string == null) {
            return "";
        } else {
            return string.toLowerCase().trim();
        }
    }
}
