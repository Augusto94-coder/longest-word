package org.lessons.java.basics;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String firstWord = scanner.nextLine();
    String secondWord = scanner.nextLine();

    if (firstWord.length() > secondWord.length()) {
        System.out.println("La prima parola è più lunga della seconda");
    } else if (secondWord.length() > firstWord.length()) {
        System.out.println("La seconda parola è più lunga della prima");
    } else {
        System.out.println("Le parole hanno la stessa lunghezza");
    }
    
    
}
}

