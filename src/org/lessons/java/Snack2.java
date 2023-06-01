package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] names = {"Aldo", "Giovanni", "Giacomo", "Mago", "Lillo"};
        String[] surnames = {"Baglio", "Storti", "Poretti", "Forrest", "Greg"};

        Random random = new Random();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + surnames[random.nextInt(names.length)]);
        }
    }
}
