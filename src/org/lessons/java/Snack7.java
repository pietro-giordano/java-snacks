package org.lessons.java;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero di secondi per convertirlo nel formato hh.mm.ss:");
        int seconds = scanner.nextInt();
        int h = (seconds / 3600);
        int m = (seconds - (h * 3600)) / 60;
        int s = seconds - (h * 3600) - (m * 60);
        System.out.println(seconds + " secondi equivalgono a: " + h + " ore, " + m + " minuti e " + s + " secondi");
    }
}
