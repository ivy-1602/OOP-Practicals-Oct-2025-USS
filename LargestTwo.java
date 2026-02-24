/**
 * Find Largest of Two Numbers
 * Simple comparison using if-else
 */
import java.util.Scanner;

class LargestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        if(a > b)
            System.out.println(a + " is largest");
        else
            System.out.println(b + " is largest");
        sc.close();
    }
}
