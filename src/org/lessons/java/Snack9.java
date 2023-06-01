package org.lessons.java;

public class Snack9 {
    public static void main(String[] args) {
        System.out.println("Ciao, questo codice calcola la somma dei numeri da 1 a 10 e la media degli stessi.");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("La somma totale è: " + sum);
        int average = sum / 10;
        System.out.println("La media invece è: " + average);
    }
}
