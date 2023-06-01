package org.lessons.java;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean validationNumber = false;

        do {
            System.out.print("Inserisci numero di 4 cifre:");
            number = scanner.nextInt();
            if (number > 999 && number < 10000) {
                // valid number
                validationNumber = true;
            } else {
                System.out.println("Numero non valido!");
            }
        } while (!validationNumber);
        System.out.println("Il numero selezionato è: " + number);

        int sum = (number / 1000 % 10) + (number / 100 % 10) + (number / 10 % 10) + (number % 10);
        System.out.println("La somma delle cifre che lo compongono è: " + sum);
    }
}
