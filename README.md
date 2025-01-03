# 📖 Java Tutorial and Sample Program Explanation

This README file provides an overview of the Java programs and scenarios included in the project, focusing on fundamental to advanced Java concepts. Each section highlights the purpose, key concepts, and functionality of the program.

---

## 🧰 **Java Tutorial Overview**

### 1️⃣ **Introduction to Java**
- Java is a versatile programming language widely used for various applications.
- The tutorial begins with simple print statements and progresses to advanced topics like OOP and data structures.

### 2️⃣ **Data Types and Variables**
- **Data Types**: Includes primitives such as `int`, `double`, `char`, and `boolean`.
- **Variables**: Store values, like `count` (integer) or `price` (double).
- Example: Demonstrating the difference between numeric and textual data storage.

```java
int count = 10;
double price = 45.99;
char grade = 'A';
boolean isAvailable = true;
```

### 3️⃣ **Operators**
- Arithmetic (`+`, `-`, `*`), relational (`>`, `<`), and logical operators are demonstrated.
- Example: Calculating the total price of items and comparing numbers.

```java
int num1 = 15;
int num2 = 5;
System.out.println("Multiplication: " + (num1 * num2));
```

### 4️⃣ **Looping**
- Covers `for` and `while` loops for repetitive tasks.
- Example: Using `-1` as an end parameter in a `for` loop.

```java
for (int i = 5; i >= -1; i--) {
    System.out.println("Current Value of i: " + i);
}
```

### 5️⃣ **Object-Oriented Programming (OOP)**
- **Key Principles**:
  - **Encapsulation**: Bundling data with methods.
  - **Inheritance**: Extending a class's functionality.
  - **Polymorphism**: Different behaviors for the same method.
- **Example**:

```java
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Electronics extends Product {
    private int warranty;

    public Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Warranty: " + warranty + " years");
    }
}
```

### 6️⃣ **Data Structures and Algorithms (DSA)**
- **Key Concepts**:
  - **Arrays**: Storing collections of data.
  - **Lists**: Dynamic data structures.
  - **Sorting Algorithms**: Example using bubble sort.
- **Example**:

```java
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
```

---

## 🛍️ **Scenario Program: Store Inventory Management**

### 🎯 **Scenario Overview**
- **Goal**: Simulate managing a small store's inventory.
- **Features**:
  - Track item count, category, and price.
  - Calculate total inventory value.
  - Indicate when restocking is needed.

### 🛠️ **Program Components**

1. **Data Types and Variables**
   - Used to define item details:
     ```java
     int itemCount = 10;
     double itemPrice = 49.99;
     char itemCategory = 'E';
     boolean restockNeeded = false;
     ```

2. **Operators**
   - Calculate the total price of items:
     ```java
     double totalPrice = itemCount * itemPrice;
     ```

3. **Conditional Statements**
   - Determine if restocking is needed:
     ```java
     if (itemCount < 5) {
         restockNeeded = true;
     }
     ```

4. **Looping**
   - Simulate sales with a `for` loop:
     ```java
     for (int i = itemCount; i > 0; i--) {
         System.out.println("Selling item... Remaining stock: " + (i - 1));
         itemCount--;
     }
     ```

   - Check stock levels with a `while` loop:
     ```java
     while (currentStock >= 0) {
         System.out.println("Current Stock: " + currentStock);
         currentStock--;
     }
     ```

5. **Object-Oriented Programming (OOP)**
   - Extend functionality by introducing a `Product` class:
     ```java
     class Product {
         String name;
         double price;

         public Product(String name, double price) {
             this.name = name;
             this.price = price;
         }

         public void displayInfo() {
             System.out.println(name + ": $" + price);
         }
     }
     ```

6. **Data Structures**
   - Use an array to store multiple products:
     ```java
     Product[] products = {
         new Product("Laptop", 799.99),
         new Product("Smartphone", 599.99),
         new Product("Headphones", 29.99)
     };

     for (Product product : products) {
         product.displayInfo();
     }
     ```

### 📝 **Expected Output**
- Displays initial stock details.
- Shows simulated sales and stock depletion.
- Indicates if restocking is required.
- Demonstrates use of OOP and DSA concepts.

---

## 🔗 **Conclusion**
This tutorial and program provide a hands-on approach to learning Java, focusing on practical applications of core programming concepts. The scenario program ties these concepts together in a real-world example, making it easier to understand their relevance and utility.

Happy Coding! 🚀

Created by: Arron Kian Parejas
