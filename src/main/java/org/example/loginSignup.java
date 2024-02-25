package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class loginSignup {
    private static HashMap<String, String> users = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    login(scanner);
                    break;
                case 2:
                    signup(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }

    private static void login(Scanner scanner){
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    private static void signup(Scanner scanner){
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please choose another one.");
            return;
        }
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        users.put(username, password);
        System.out.println("Signup successful!");
    }
}
