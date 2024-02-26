package org.example;

public class MaxMinArray {

    /*Problem: Write a Java program to find the maximum and minimum elements in an array of integers.*/
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7, 2, 8, 4, 6, 0};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }


        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
