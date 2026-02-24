/**
 * Swap Using Temporary Variable
 * Classic approach with third variable
 */
import java.util.Scanner;

class SwapWithThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using third variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        sc.close();
    }
}
