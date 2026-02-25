/**
 * Palindrome Number Checker
 * Reads same forwards and backwards
 * Example: 121, 1331, 12321
 */
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), rev = 0, temp = num;
        
        while(temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        
        if(rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
