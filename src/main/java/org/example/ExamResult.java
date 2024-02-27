package org.example;

import java.util.Scanner;

/*Problem:
Write a Java program that determines whether a student has passed or failed an exam. The passing grade is 60. If the student's score is greater than or equal to 60, the program should print "Passed". Otherwise, it should print "Failed".*/
public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your exam score: ");

        int score = scanner.nextInt();

        if (score >= 33){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        scanner.close();

    }
}
