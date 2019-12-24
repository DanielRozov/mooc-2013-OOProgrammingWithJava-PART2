
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

//        ArrayList<String> translations = dictionary.translationList();
//        for (String translation : translations) {
//            System.out.println(translation);
//        }
        Scanner reader = new Scanner(System.in);

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
