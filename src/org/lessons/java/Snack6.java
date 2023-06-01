package org.lessons.java;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire numero che da stringa verrà convertito in intero:");
        String stringToNumber = scanner.nextLine();
        int number = 0;
        int multiplier = 1;

        for (int i = stringToNumber.length() - 1; i >= 0; i--) {
            char digitChar = stringToNumber.charAt(i);
            int digitValue = digitChar - '0'; // Conversione da carattere a valore numerico

            number += digitValue * multiplier;
            multiplier *= 10;
        }

        System.out.println("Numero convertito: " + number);
    }
}
