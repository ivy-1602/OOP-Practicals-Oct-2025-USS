/**
 * Armstrong Number Checker
 * A number equal to sum of cubes of its digits
 * Example: 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
 */
import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), sum = 0, temp = num;
        
        while(temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        
        if(sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
        sc.close();
    }
}
