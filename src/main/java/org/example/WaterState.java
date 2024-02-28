package org.example;

import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double temperatureCelsius = scanner.nextDouble();

        if (temperatureCelsius <= 0){
            System.out.println("Water is in solid state (ice) at " + temperatureCelsius + " degrees Celsius.");
        }else if (temperatureCelsius >= 100) {
            System.out.println("Water is in gaseous state (steam) at " + temperatureCelsius + " degrees Celsius.");
        } else {
            System.out.println("Water is in liquid state at " + temperatureCelsius + " degrees Celsius.");
        }

        scanner.close();
    }
}
