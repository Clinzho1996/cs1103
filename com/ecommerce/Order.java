package com.ecommerce;

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;

    public Order(int orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.orderTotal = products.stream().mapToDouble(Product::getPrice).sum();
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void generateOrderSummary() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in order:");
        products.forEach(System.out::println);
        System.out.println("Order Total: " + orderTotal);
    }

    public void updateOrderStatus() {
        // Placeholder for order status update logic
        System.out.println("Order status updated for Order ID: " + orderID);
    }
}
