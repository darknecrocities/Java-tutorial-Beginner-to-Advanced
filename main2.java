public class main2 {
    public static void main(String[] args) {
        // JAVA INTRODUCTION
        System.out.println("Java Example: Demonstrating Concepts");

        // DATA TYPES AND VARIABLES
        // Declaring and initializing variables with different data types
        int count = 10; // Integer data type
        double price = 45.99; // Double data type for floating-point numbers
        char grade = 'A'; // Character data type for a single character
        boolean isAvailable = true; // Boolean data type representing true or false

        // Output the values of the variables
        System.out.println("Count: " + count);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Available: " + isAvailable);

        // OPERATORS
        // Demonstrating arithmetic operations and comparison
        int num1 = 15;
        int num2 = 5;
        System.out.println("Subtraction: " + (num1 - num2)); // Subtraction operation
        System.out.println("Multiplication: " + (num1 * num2)); // Multiplication operation
        System.out.println("Is num1 greater than num2? " + (num1 > num2)); // Comparison operation

        // LOOPING
        // **For Loop**: Loops from 5 to -1 (decreasing by 1 each iteration)
        System.out.println("For Loop Example with -1 as End Condition:");
        for (int i = 5; i >= -1; i--) { // Starts at 5 and decreases until -1
            System.out.println("Current Value of i: " + i); // Prints the current value of i
        }

        // **While Loop**: Loops while counter is greater than or equal to 0
        System.out.println("While Loop Example with Condition Ending at 0:");
        int counter = 5; // Initialize counter to 5
        while (counter >= 0) { // Loop continues until counter is less than 0
            System.out.println("Counter: " + counter); // Prints the current value of counter
            counter--; // Decreases the counter by 1 after each iteration
        }

        // CONDITIONAL STATEMENTS
        // **If-Else Statement**: Checks if a person is eligible to vote based on age
        System.out.println("Conditional Example:");
        int age = 17; // Sample age to check eligibility
        if (age >= 18) { // If age is 18 or greater
            System.out.println("You are eligible to vote.");
        } else { // If age is less than 18
            System.out.println("You are not eligible to vote yet.");
        }

        // SWITCH-CASE LESSON
        // Switch case to display the day of the week based on a number
        System.out.println("Switch-Case Example:");
        int day = 3; // Representing Wednesday with 3
        switch (day) { // Evaluate the value of 'day'
            case 1:
                System.out.println("Monday"); // If day is 1, print Monday
                break; // Exit the switch case
            case 2:
                System.out.println("Tuesday"); // If day is 2, print Tuesday
                break; // Exit the switch case
            case 3:
                System.out.println("Wednesday"); // If day is 3, print Wednesday
                break; // Exit the switch case
            case 4:
                System.out.println("Thursday"); // If day is 4, print Thursday
                break; // Exit the switch case
            case 5:
                System.out.println("Friday"); // If day is 5, print Friday
                break; // Exit the switch case
            case 6:
                System.out.println("Saturday"); // If day is 6, print Saturday
                break; // Exit the switch case
            case 7:
                System.out.println("Sunday"); // If day is 7, print Sunday
                break; // Exit the switch case
            default: // If no cases match, execute the default case
                System.out.println("Invalid day number!");
        }

        // End of demo
        System.out.println("Demo completed.");
    }
}
