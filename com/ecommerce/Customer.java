package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public void addProductToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeProductFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public double calculateTotalCost() {
        return shoppingCart.stream().mapToDouble(Product::getPrice).sum();
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void placeOrder() {
        // For simplicity, we'll just print the order summary here.
        System.out.println("Order placed for customer: " + name);
        System.out.println("Products in order:");
        shoppingCart.forEach(System.out::println);
        System.out.println("Total cost: " + calculateTotalCost());
        shoppingCart.clear(); // Clear cart after placing order
    }
}
