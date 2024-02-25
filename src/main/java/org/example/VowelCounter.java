package org.example;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

        for (char ch : input.toLowerCase().toCharArray()){
            switch (ch) {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
            }
        }

        System.out.println("Number of 'a' in the string: " + aCount);
        System.out.println("Number of 'e' in the string: " + eCount);
        System.out.println("Number of 'i' in the string: " + iCount);
        System.out.println("Number of 'o' in the string: " + oCount);
        System.out.println("Number of 'u' in the string: " + uCount);
    }
}
