package org.example;

public class Practice {
    public static void main(String[] args) {
        String str = "level";
        char lastChar = str.charAt( str.length() - 2);
        char secondChar = str.charAt(1);

        if (lastChar == secondChar) {
            System.out.println("Matched");
        } else {
            System.out.println("oops worng");
        }
    }
}
