/*
 * Customer.java
 * Represents a customer in the store
 */
public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean canPay(double amount) {
        return balance >= amount;
    }

    public void pay(double amount) {
        if (!canPay(amount)) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }
}