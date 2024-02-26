package org.example;

import java.util.Arrays;

/*Problem: Write a Java program to sort an array of strings in lexicographical (dictionary) order  (alphabetical order).*/

public class StringLexicographicalSort {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "grape", "orange", "pineapple"};

        Arrays.sort(words);

        System.out.println("Sorted array of strings:");
        for (String word:words){
            System.out.println(word);
        }
    }
}
