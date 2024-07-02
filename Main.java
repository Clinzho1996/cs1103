import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.orders.Order;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of products
        Product product1 = new Product(1, "Laptop", 1000.00);
        Product product2 = new Product(2, "Smartphone", 500.00);
        Product product3 = new Product(3, "Headphones", 150.00);

        // Create instance of customer
        Customer customer = new Customer(1, "John Doe");

        // Customer browsing products and adding them to the cart
        customer.addProductToCart(product1);
        customer.addProductToCart(product2);
        customer.addProductToCart(product3);

        // Display products in customer's cart
        System.out.println("Products in " + customer.getName() + "'s cart:");
        customer.getShoppingCart().forEach(System.out::println);

        // Calculate total cost of products in cart
        System.out.println("Total cost: " + customer.calculateTotalCost());

        // Customer places an order
        customer.placeOrder();

        // Create an order instance
        Order order = new Order(1, customer, List.of(product1, product2));

        // Generate order summary
        order.generateOrderSummary();

        // Update order status
        order.updateOrderStatus();
    }
}
