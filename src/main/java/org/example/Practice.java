package org.example;

import static java.awt.SystemColor.text;

public class Practice {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] arr = {10, 5, 8, 20, 15};

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }
}
