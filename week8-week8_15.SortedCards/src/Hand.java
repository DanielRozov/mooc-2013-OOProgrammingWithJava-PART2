
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cardsInHand;

    public Hand() {
        this.cardsInHand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.cardsInHand.add(card);
    }

    public void sort() {
        Collections.sort(this.cardsInHand);
    }

    public void print() {
        for (Card card : this.cardsInHand) {
            System.out.println(card.toString());
        }
    }

    private int sum() {
        int sum = 0;

        for (Card card : this.cardsInHand) {
            sum += card.getValue();
        }

        return sum;
    }

    public void sortAgainstSuit() {
        Collections.sort(this.cardsInHand, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand hand) {
        return this.sum() - hand.sum();
    }
}
