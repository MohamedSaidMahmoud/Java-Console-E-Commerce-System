/*
 * TV.java
 * Represents a TV product (non-expirable product, shippable)
 */
public class TV extends NonExpirableProduct implements Shippable {
    private double weight; // in kg

    public TV(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}