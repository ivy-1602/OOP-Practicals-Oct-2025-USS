/**
 * Exception Handling
 * try-catch-finally blocks
 * Custom exceptions and multiple catch blocks
 */

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class AgeValidator {
    void validateAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example 1: ArithmeticException
        System.out.println("--- Division Example ---");
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            int result = num / den;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Division operation completed.\n");
        }
        
        // Example 2: ArrayIndexOutOfBoundsException
        System.out.println("--- Array Access Example ---");
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Element: " + arr[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!");
        } finally {
            System.out.println("Array operation completed.\n");
        }
        
        // Example 3: Custom Exception
        System.out.println("--- Age Validation Example ---");
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            AgeValidator validator = new AgeValidator();
            validator.validateAge(age);
        } catch(InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            System.out.println("Validation completed.");
        }
        
        sc.close();
    }
}
