package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola per verificare se sia palindroma:");
        String word = scanner.nextLine().toLowerCase();

        boolean pal = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                pal = false;
                break;
            }
        }
        if (pal) {
            System.out.println("La parola inserita è palindroma");
        } else {
            System.out.println("La parola inserita NON è palindroma");
        }
    }
}
