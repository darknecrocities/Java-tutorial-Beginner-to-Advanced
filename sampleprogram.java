// Java Sample Program: Demonstrating Java Concepts with Comments on the Scenario
// Scenario: A program to manage the inventory of a small store, calculate the total price of items, and display a message if restocking is required.

public class sampleprogram {
    public static void main(String[] args) {
        // JAVA INTRODUCTION
        // This program demonstrates how to manage store inventory using loops, variables, and conditions.
        System.out.println("Welcome to Store Inventory Management System!");

        // DATA TYPES AND VARIABLES
        // Defining variables for item information
        int itemCount = 10; // Number of items in stock
        double itemPrice = 49.99; // Price per item
        char itemCategory = 'E'; // Category 'E' stands for Electronics
        boolean restockNeeded = false; // Indicates whether restocking is required

        System.out.println("Initial Item Count: " + itemCount);
        System.out.println("Price per Item: " + itemPrice);
        System.out.println("Item Category: " + itemCategory);

        // OPERATORS
        // Calculating total price of items in stock
        double totalPrice = itemCount * itemPrice;
        System.out.println("Total Price of Items: " + totalPrice);

        // Conditional check for restocking
        if (itemCount < 5) {
            restockNeeded = true;
        }

        // Display restocking message
        if (restockNeeded) {
            System.out.println("Restock Needed: Yes");
        } else {
            System.out.println("Restock Needed: No");
        }

        // LOOPING
        // Simulating item sales using a for-loop
        System.out.println("Simulating Item Sales:");
        for (int i = itemCount; i > 0; i--) {
            System.out.println("Selling item... Remaining stock: " + (i - 1));
            itemCount--;
        }

        // Checking stock levels with a while-loop
        System.out.println("Checking stock levels:");
        int currentStock = itemCount;
        while (currentStock >= 0) {
            System.out.println("Current Stock: " + currentStock);
            currentStock--;
        }

        // Conditional statement demonstrating eligibility to restock
        System.out.println("Checking if restock is needed:");
        if (itemCount <= 0) {
            System.out.println("All items sold out! Restocking is required.");
        } else {
            System.out.println("Stock is sufficient.");
        }

        // PROGRAM CONCLUSION
        System.out.println("Inventory Management Process Completed.");
    }
}
