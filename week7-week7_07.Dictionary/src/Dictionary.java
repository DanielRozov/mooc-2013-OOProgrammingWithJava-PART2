
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

    private String stringCleaner(String string) {

        if (string == null) {
            return "";
        } else {
            return string.toLowerCase().trim();
        }
    }
}
