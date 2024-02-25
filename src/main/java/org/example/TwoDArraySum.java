package org.example;

public class TwoDArraySum {

    // Problem: Write a Java program to find the sum of all elements in a two-dimensional array.
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int sum = findSum(matrix);
        System.out.println("The sum of all elements in the 2D array is: " + sum);

    }

    private static int findSum(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }
}
