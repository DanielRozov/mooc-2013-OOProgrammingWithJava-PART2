
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("Matti");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String middleLine = createMiddleLine(characterString);
        int printTimes = middleLine.length() / 2 + 2;

        printTheTopAndBottom(printTimes);

        System.out.println(":)" + middleLine + ":)");

        printTheTopAndBottom(printTimes);
    }

    private static String createMiddleLine(String characterString) {
        String middleLine = " " + characterString + " ";

        if (characterString.length() % 2 == 1) {
            middleLine += " ";
        }

        return middleLine;
    }

    private static void printTheTopAndBottom(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }
}
