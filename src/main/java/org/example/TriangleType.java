package org.example;

import java.util.Scanner;

/*roblem:
Write a Java program that takes the lengths of three sides of a triangle as input and determines whether the triangle is equilateral, isosceles, or scalene.*/
public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of three sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

        scanner.close();
    }
}
