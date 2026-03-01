/**
 * Abstract Classes
 * Cannot be instantiated, must be inherited
 * Can have abstract (no body) and concrete (with body) methods
 */

abstract class Shape {
    String color;
    
    // Constructor
    Shape(String color) {
        this.color = color;
    }
    
    // Abstract method (no implementation)
    abstract double calculateArea();
    
    // Concrete method (with implementation)
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        System.out.println("--- Circle ---");
        Shape circle = new Circle("Red", 5.0);
        circle.display();
        
        System.out.println("\n--- Rectangle ---");
        Shape rectangle = new Rectangle("Blue", 10.0, 5.0);
        rectangle.display();
    }
}
