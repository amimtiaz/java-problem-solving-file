package org.example;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} 
        };
        
        int sum = calculateMatrixSum(matrix);
        System.out.println("Sum of all elements in the matrix: "+sum);
    }

    private static int calculateMatrixSum(int[][] matrix) {
        int sum =0;
        for (int i = 0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
