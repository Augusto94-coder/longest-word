package org.lessons.java.basics;

import java.util.Scanner;

public class OldestPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci l'eta' della prima persona");
        int firstAge = scanner.nextInt();
        System.out.println("Inserisci l'eta' della seconda persona");
        int secondAge = scanner.nextInt();

        if (firstAge > secondAge) {
            System.out.println("La prima persona è più grande della seconda");
        } else if (secondAge > firstAge) {
            System.out.println("La seconda persona è più grande della prima");
        } else {
            System.out.println("Le persone hanno la stessa eta'");
        }

    }
}
