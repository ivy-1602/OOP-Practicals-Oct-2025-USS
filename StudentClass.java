/**
 * Introduction to Classes and Objects
 * Custom class with multiple constructors and methods
 */
class Student {
    String name;
    int rollNo;
    double marks;
    
    // Default constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
        marks = 0.0;
    }
    
    // Parameterized constructor
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    
    // Method to display student details
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    
    // Method to calculate grade
    String calculateGrade() {
        if(marks >= 90) return "A+";
        else if(marks >= 80) return "A";
        else if(marks >= 70) return "B";
        else if(marks >= 60) return "C";
        else if(marks >= 50) return "D";
        else return "F";
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.display();
        
        // Using parameterized constructor
        Student s2 = new Student("Uma", 101, 95.5);
        s2.display();
        
        Student s3 = new Student("Raj", 102, 78.0);
        s3.display();
    }
}
