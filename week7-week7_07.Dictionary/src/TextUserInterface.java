
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("    add - adds a word to the dictionary");
        System.out.println("    translate - adds asks a word and"
                + " prints its translation");
        System.out.println("    quit - quit the text user"
                + " interface");
        System.out.println("");

        while (true) {
            System.out.println("Statement: ");
            String statement = this.reader.nextLine();

            if (statement.contains("quit")) {
                break;
            }

            workOnApproval(statement);
            System.out.println("");
        }

        System.out.println("Cheers!");
    }

    private void workOnApproval(String statement) {
        if (statement.equals("add")) {
            add();
        } else if (statement.equals("translate")) {
            translate();
        } else {
            System.out.println("Unknown statement");
        }
    }

    private void add() {
        System.out.println("In Finnish: ");
        String inFinnish = this.reader.nextLine();

        System.out.println("Translation: ");
        String translation = this.reader.nextLine();

        this.dictionary.add(inFinnish, translation);
    }

    private void translate() {
        System.out.println("Give a word: ");
        String givenWord = this.reader.nextLine();

        System.out.println("Translation: "
                + this.dictionary.translate(givenWord));
    }
}
