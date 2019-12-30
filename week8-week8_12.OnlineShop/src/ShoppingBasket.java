
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new TreeMap<String, Purchase>();
    }

    public void add(String product, int price) {

        if (this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {

            this.basket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;

        for (Purchase p : this.basket.values()) {
            totalPrice += p.price();
        }

        return totalPrice;
    }

    public void print() {
        for (Purchase item : this.basket.values()) {
            System.out.println(item.toString());
        }
    }
}
