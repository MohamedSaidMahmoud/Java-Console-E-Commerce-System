
/*
 * ShippingService.java
 * Represents a shipping service
 */
import java.util.List;

public class ShippingService {
    public void ship(List<Shippable> items) {
        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        for (Shippable item : items) {
            int count = 0;
            String name = item.getName();
            double weight = item.getWeight();
            // Count occurrences
            for (Shippable s : items) {
                if (s.getName().equals(name) && s.getWeight() == weight) {
                    count++;
                }
            }
            // Only print once per unique item
            if (items.indexOf(item) == items.lastIndexOf(item) - count + 1) {
                System.out.printf("%dx %-12s %4.0fg\n", count, name, weight * 1000);
            }
            totalWeight += weight;
        }
        System.out.printf("Total package weight %.1fkg\n", totalWeight);
    }
}