
/*
 * CheckoutService.java
 * Represents a checkout service
 */
import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    private static final double SHIPPING_FEE = 30.0;

    public void checkout(Customer customer, Cart cart, ShippingService shippingService) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Cannot checkout.");
            return;
        }

        // Validate products
        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            int qty = item.getQuantity();
            if (product.isExpired()) {
                System.out.println(product.getName() + " is expired. Cannot checkout.");
                return;
            }
            if (!product.isAvailable(qty)) {
                System.out.println(product.getName() + " is out of stock. Cannot checkout.");
                return;
            }
        }

        double subtotal = cart.calculateSubtotal();
        double total = subtotal + SHIPPING_FEE;

        if (!customer.canPay(total)) {
            System.out.println("Insufficient balance. Cannot checkout.");
            return;
        }

        // Deduct balance
        customer.pay(total);

        // Reduce product quantities
        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceQuantity(item.getQuantity());
        }

        // Collect shippable items
        List<Shippable> shippables = new ArrayList<>();
        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            if (product instanceof Shippable) {
                for (int i = 0; i < item.getQuantity(); i++) {
                    shippables.add((Shippable) product);
                }
            }
        }
        if (!shippables.isEmpty()) {
            shippingService.ship(shippables);
        }

        // Print receipt
        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.printf("%dx %-13s %4.0f\n", item.getQuantity(), item.getProduct().getName(),
                    item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal         %.0f\n", subtotal);
        System.out.printf("Shipping         %.0f\n", SHIPPING_FEE);
        System.out.printf("Amount           %.0f\n", total);
        System.out.printf("Remaining Balance %.0f\n", customer.getBalance());
    }
}