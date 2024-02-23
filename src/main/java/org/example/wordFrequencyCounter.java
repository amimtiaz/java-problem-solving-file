package org.example;


/*Problem Name: "Word Frequency Counter"

Problem Description:
Write a Java program that reads a text input from the user and counts the frequency of each word in the text. The program should then display the word frequencies in descending order along with the words themselves.*/

import java.util.*;

public class wordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        scanner.close();

        String[] words = text.split("\\s+");

        Map<String,Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            wordFreq.put(lowercaseWord, wordFreq.getOrDefault(lowercaseWord, 0) + 1);
        }

        TreeMap<Integer, String> sortedFreq = new TreeMap<>(Collections.reverseOrder());

        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()){
            sortedFreq.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nWord Frequency:");
        for (Map.Entry<Integer, String> entry : sortedFreq.entrySet()) {
            System.out.println(entry.getValue() + ": " + entry.getKey());
        }
    }

    /*This program takes input from the user, splits it into words, counts the frequency of each word, and then displays the word frequencies in descending order. It uses a HashMap to store the word frequencies and a TreeMap to sort them in descending order based on frequency. Finally, it prints out the sorted word frequencies.*/
}