package org.example;

import java.util.HashMap;
import java.util.Map;

/*Problem: Write a Java program to count the occurrences of each character in a given string and print the result.*/
public class CharacterOccurrences {
    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> charCount = countCharacterOccurrences(input);

        System.out.println("Occurrences of each character: ");
        for (Map.Entry<Character, Integer>entry: charCount.entrySet()){
            System.out.println("'" +entry.getKey()+"' : " + entry.getKey());
        }
    }

    private static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character,Integer> charCount = new HashMap<>();
        for (char c:str.toCharArray()){
            if (Character.isLetter(c)){
                charCount.put(c, charCount.getOrDefault(c,0)+1);
            }
        }
        return charCount;
    }
}
