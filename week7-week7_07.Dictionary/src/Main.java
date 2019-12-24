
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());

        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());
    }
}
