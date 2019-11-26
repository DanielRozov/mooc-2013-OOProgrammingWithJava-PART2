
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!

//        Exercise 4.1: Class Thing
//        Thing book = new Thing("Happiness in Three Steps", 2);
//        Thing mobile = new Thing("Nokia 3210", 1);
//
//        System.out.println("Book name: " + book.getName());
//        System.out.println("Book weight: " + book.getWeight());
//
//        System.out.println("Book: " + book);
//        System.out.println("Mobile: " + mobile);
//        Exercise 4.2: Class Suitcase
//        Exercise 4.3: Language Check
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);
//
//        Suitcase suitcase = new Suitcase(5);
//        System.out.println(suitcase);
//
//        suitcase.addThing(book);
//        System.out.println(suitcase);
//
//        suitcase.addThing(mobile);
//        System.out.println(suitcase);
//
//        suitcase.addThing(brick);
//        System.out.println(suitcase);
//        Exercise 4.4: Every Thing
//        Suitcase suitcase = new Suitcase(10);
//        suitcase.addThing(book);
//        suitcase.addThing(mobile);
//        suitcase.addThing(brick);
//
//        System.out.println("Your suitcase contains the following "
//                + "things:");
//        suitcase.printThings();
//        System.out.println("Total weight: " + suitcase.totalWeight()
//                + " kg");
//        Exercise 4.5: The heaviest Thing
//        Suitcase suitcase = new Suitcase(10);
//        suitcase.addThing(book);
//        suitcase.addThing(mobile);
//        suitcase.addThing(brick);
//
//        Thing heaviest = suitcase.heaviestThing();
//        System.out.println("The heaviest thing: " + heaviest);

        //Exercise 4.6: Container
        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);
    }

}
