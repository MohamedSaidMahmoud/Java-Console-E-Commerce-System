/* 
 * Chesse.java
 * Represents a Cheese product (expirable product, shippable)
*/

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        // Check if product already in cart
        for (CartItem item : items) {
            if (item.getProduct() == product) {
                // Increase quantity
                items.set(items.indexOf(item), new CartItem(product, item.getQuantity() + quantity));
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double calculateSubtotal() {
        double subtotal = 0;
        for (CartItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}