package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack3 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(50);
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("L'array di numeri generato casualmente è: " + Arrays.toString(numbers));

        int sum = 0;
        for (int i = 0; i < numbers.length; i+=2) {
            sum += numbers[i];
        }
        System.out.println("La somma degli elementi in posizione dispari è: " + sum);
    }
}
