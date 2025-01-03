// Java Tutorial: Beginner to Advanced

// Import required libraries for advanced topics
import java.util.*;

public class main {
    public static void main (String[] args) {
        // BEGINNER LEVEL: JAVA INTRODUCTION
        // Printing a simple statement
        System.out.println("Welcome to the Java Tutorial!");

        // DATA TYPES AND VARIABLES
        // Primitive data types
        int myInt = 25; // Integer
        double myDouble = 19.99; // Double (floating-point)
        char myChar = 'A'; // Character
        boolean myBool = true; // Boolean

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBool);

        // OPERATORS
        int num1 = 10, num2 = 20;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Comparison: " + (num1 > num2));

        // LOOPING
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("While Loop Example:");
        int counter = 1;
        while (counter <= 5) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // CONDITIONAL STATEMENTS
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // FUNCTIONS AND METHODS
        System.out.println("Function Example:");
        int sum = addNumbers(5, 10);
        System.out.println("Sum of 5 and 10: " + sum);

        // ADVANCED LEVEL: OBJECT-ORIENTED PROGRAMMING
        // Class and Object
        System.out.println("OOP: Classes and Objects");
        Person person = new Person("John", 30);
        person.introduce();

        // Encapsulation
        System.out.println("Age (via encapsulation): " + person.getAge());

        // Polymorphism
        System.out.println("OOP: Polymorphism Example");
        Shape shape = new Circle();
        shape.draw();

        // Data Structures: Lists
        System.out.println("Data Structures: Lists");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        System.out.println("List elements: " + numbers);

        // Data Structures: HashMap
        System.out.println("Data Structures: HashMap");
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("HashMap elements: " + map);

        // Algorithms: Sorting
        System.out.println("Algorithms: Sorting an Array");
        int[] array = {4, 2, 9, 1};
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        // THREADS
        System.out.println("Multithreading Example:");
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    // Function to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

// OOP Example Classes
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    public int getAge() {
        return age;
    }
}

// Abstract Class and Polymorphism Example
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
