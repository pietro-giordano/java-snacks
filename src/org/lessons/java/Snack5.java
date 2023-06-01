package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola per sapere quanti caratteri alfabetici, quanti numeri e quanti simboli contiene:");
        String word = scanner.nextLine();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int sumChar = 0;
        int sumNum = 0;
        int sumNotChar = 0;

        for (int i = 0; i < word.length(); i++) {
            String current = String.valueOf(word.charAt(i));
            if (Arrays.asList(alphabet).contains(current)) {
                sumChar++;
            } else if (Arrays.asList(numbers).contains(current)) {
                sumNum++;
            } else {
                sumNotChar++;
            }
        }
        System.out.println("La parola contiene " + sumChar + " lettere, " + sumNum + " numeri e " + sumNotChar + " caratteri speciali.");
    }
}
