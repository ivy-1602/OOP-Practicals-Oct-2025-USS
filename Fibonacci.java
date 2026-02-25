/**
 * Fibonacci Series Generator
 * Classic sequence where each number is sum of previous two
 * Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21...
 */
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        
        System.out.print("Fibonacci: " + a + " " + b);
        for(int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        sc.close();
    }
}
