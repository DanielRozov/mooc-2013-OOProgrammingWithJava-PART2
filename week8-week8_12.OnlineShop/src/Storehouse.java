
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.products = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if (!this.products.containsKey(product)) {
            return -99;
        }
        
        return this.products.get(product);
    }

    public int stock(String product) {
        if (!this.stocks.containsKey(product)) {
            return 0;
        }
        
        return this.stocks.get(product);
    }

    public boolean take(String product) {
        int stock = 0;
        
        if (!this.products.containsKey(product)) {
            return false;
            
        } else if (this.stocks.get(product) > 0) {
            stock = this.stocks.get(product) - 1;
            this.stocks.replace(product, stock);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        return this.products.keySet();
    }
}
