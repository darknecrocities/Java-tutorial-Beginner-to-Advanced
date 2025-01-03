public class main2 {
    public static void main(String[] args) {
        // JAVA INTRODUCTION
        System.out.println("Java Example: Demonstrating Concepts");

        // DATA TYPES AND VARIABLES
        int count = 10; // Integer
        double price = 45.99; // Double
        char grade = 'A'; // Character
        boolean isAvailable = true; // Boolean

        System.out.println("Count: " + count);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Available: " + isAvailable);

        // OPERATORS
        int num1 = 15;
        int num2 = 5;
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Is num1 greater than num2? " + (num1 > num2));

        // LOOPING
        System.out.println("For Loop Example with -1 as End Condition:");
        for (int i = 5; i >= -1; i--) {
            System.out.println("Current Value of i: " + i);
        }

        System.out.println("While Loop Example with Condition Ending at 0:");
        int counter = 5;
        while (counter >= 0) {
            System.out.println("Counter: " + counter);
            counter--;
        }

        // Demonstrating with a Conditional Statement
        System.out.println("Conditional Example:");
        int age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }

        System.out.println("Demo completed.");
    }
}
