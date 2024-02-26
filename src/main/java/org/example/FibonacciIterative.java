package org.example;

import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        long result = fibonacci(n);
        System.out.println("The " + n+ "th Fibonacci number is: " + result);
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fibPrev = 0;
        long fibCurr = 1;

        for (int i = 2; i <= n; i++) {
            long fibNext = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = fibNext;
        }
        return fibCurr;
    }
}
