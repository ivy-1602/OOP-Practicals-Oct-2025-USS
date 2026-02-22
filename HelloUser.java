/**
 * Interactive Hello Program
 * Introduction to Scanner class for user input
 */
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
