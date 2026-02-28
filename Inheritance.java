/**
 * Inheritance Example
 * Employee inherits from Person
 * Demonstrates 'extends' keyword and method overriding
 */

// Parent class
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Employee extends Person {
    int empId;
    double salary;
    
    Employee(String name, int age, int empId, double salary) {
        super(name, age);  // Call parent constructor
        this.empId = empId;
        this.salary = salary;
    }
    
    // Method overriding
    @Override
    void display() {
        super.display();  // Call parent method
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
    
    // New method in child class
    void calculateAnnualSalary() {
        System.out.println("Annual Salary: " + (salary * 12));
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Person Details ---");
        Person p = new Person("Amit", 25);
        p.display();
        
        System.out.println("\n--- Employee Details ---");
        Employee e = new Employee("Uma", 23, 1001, 50000);
        e.display();
        e.calculateAnnualSalary();
    }
}
