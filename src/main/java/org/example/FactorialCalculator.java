package org.example;

import java.util.Scanner;

// Problem: Write a Java program that calculates the factorial of a non-negative integer entered by the user.

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }

    private static long calculateFactorial(int n) {
     if (n == 0 || n == 1) {
         return 1;
     } else {
         long factorial = 1;
         for (int i = 2; i <= n; i++) {
             factorial *= i;
         }
         return factorial;
     }
    }
}
