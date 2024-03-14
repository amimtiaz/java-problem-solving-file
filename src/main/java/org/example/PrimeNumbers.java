package org.example;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50:");


        for (int i = 2; i<=50; i++){
            if (i % 2 == 0 || i % 3 == 0){
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }


        }
    }
}
