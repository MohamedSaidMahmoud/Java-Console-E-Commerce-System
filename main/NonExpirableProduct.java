/*
 * NonExpirableProduct.java
 * Represents a non-expirable product
 */
public abstract class NonExpirableProduct extends Product {
    public NonExpirableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}