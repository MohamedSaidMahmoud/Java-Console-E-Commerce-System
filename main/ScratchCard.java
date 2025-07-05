/*
 * ScratchCard.java
 * Represents a scratch card product (non-expirable product)
 */
public class ScratchCard extends NonExpirableProduct {
    public ScratchCard(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}