/**
 * Compile-time Polymorphism (Method Overloading)
 * Same method name, different parameters
 */

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
    
    // Method to concatenate strings
    String add(String a, String b) {
        return a + b;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Add two ints: " + calc.add(5, 10));
        System.out.println("Add three ints: " + calc.add(5, 10, 15));
        System.out.println("Add two doubles: " + calc.add(5.5, 10.5));
        System.out.println("Add strings: " + calc.add("Hello", "World"));
    }
}
