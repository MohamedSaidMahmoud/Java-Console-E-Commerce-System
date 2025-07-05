# Java Internship Challenge (June 2024)
# Java Console E-Commerce System

## Project Description
This is a simple, object-oriented e-commerce simulation written in pure Java (Java SE). It allows customers to add products to a cart, handle expirable and shippable products, checkout, pay, and process shipping. The project demonstrates clean OOP design and separation of concerns, suitable for learning or internship challenges.

## Tools & Platform
- **Language:** Java (Java SE, no external libraries)
- **Platform:** Cross-platform (Windows, Mac, Linux)
- **IDE:** Any Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or text editor
- **JDK Version:** Java 8 or higher recommended

## How to Run
1. Open a terminal/command prompt in the project directory.
2. Compile all Java files:
   ```
   javac *.java
   ```
3. Run the main class:
   ```
   java Main
   ```
4. You should see the shipment notice and checkout receipt printed in the console.

## How to Maintain & Edit the Project
- **Add New Product Types:**
  - Create a new class extending `Product`, `ExpirableProduct`, or `NonExpirableProduct` as needed.
  - Implement `Shippable` if the product should be shipped.
- **Change Business Logic:**
  - Edit the relevant service classes (`CheckoutService`, `ShippingService`) to update validation, pricing, or shipping rules.
- **Refactor or Extend:**
  - Use your IDE's refactoring tools to rename, move, or restructure classes.
  - Add new features by following the OOP structure (e.g., add discounts, user authentication, etc.).
- **Testing:**
  - Modify `Main.java` to create new test scenarios or edge cases.
- **Documentation:**
  - Add comments and update this README as you make changes.

## Project Structure
- Each class/interface is in its own `.java` file for clarity and maintainability.
- Main entities: `Product`, `Customer`, `Cart`, `CartItem`, `ShippingService`, `CheckoutService`, and product subclasses.

## Contact
Mohamed Said Mahmoud Emam
01146621429
mohammed.saiid208@gmail.com