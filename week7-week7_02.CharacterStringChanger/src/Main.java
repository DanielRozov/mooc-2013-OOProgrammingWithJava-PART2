
public class Main {

    public static void main(String[] args) {
        // Test your program here

        //Exercise 2.1: Change-class
        String word = "carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);

        System.out.println(word);

        Change change2 = new Change('r', 'x');
        word = change2.change(word);

        System.out.println(word);

        //Exercise 2.2: Changer-class
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println("ääliö älä lyö, ööliä läikkyy");
    }
}
