package org.example;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        int sum = sumArray(numbers);

        System.out.println("Sum of array elements: " + sum);
    }

    private static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum +=num;
        }
        return 0;
    }


}
