package org.example;

import java.util.Scanner;

/*Problem:
Write a Java program that takes an integer as input and prints whether the number is even or odd.*/

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        if (number % 2==0){
            System.out.println(number+ " is even");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}
