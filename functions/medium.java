package functions;

import java.util.*;

public class medium{

    public static void factorial(Integer n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static void isPrime(Integer n) {
        boolean is_prime = true;

        if (n <= 1) {
            is_prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    is_prime = false;
                    break;
                }
            }
        }

        if (is_prime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = sc.nextInt();

        System.out.println("Enter your choice:");
        System.out.println("1) Factorial");
        System.out.println("2) Check Prime");

        int choice = sc.nextInt();

        if (choice == 1) {
            factorial(x);
        } else if (choice == 2) {
            isPrime(x);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
