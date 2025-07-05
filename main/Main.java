
/*
 * Main.java
 * This is entry point of the program 
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ali", 1000);

        Cheese cheese = new Cheese("Cheese", 100, 10, LocalDate.now().plusDays(1), 0.2);
        TV tv = new TV("TV", 300, 5, 7.5);
        ScratchCard card = new ScratchCard("Scratch Card", 50, 20);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(tv, 1);
        cart.add(card, 1);

        ShippingService shippingService = new ShippingService();
        CheckoutService checkoutService = new CheckoutService();

        checkoutService.checkout(customer, cart, shippingService);
    }
}