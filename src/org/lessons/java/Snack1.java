package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = false;
        do {
            try {
                System.out.println("Inserisci un numero. Se questo è pari te lo stampo, altrimenti ti stampo il successivo");
                int n = scanner.nextInt();
                if (n % 2 == 0) {
                    System.out.println(n);
                } else {
                    System.out.println(n + 1);
                }
                flag = true;
            } catch (Exception e) {
                System.out.println("Non hai inserito un numero, riprova");
                scanner.nextLine();
            }
        } while (!flag);
    }
}
