package org.lessons.java.basics;

public class Intro {
    public static void main(String[] args) {
        
        String [] arrayStudenti = {"Gino", "Gina", "Nino", "Nina"};
        // System.out.println(arrayStudenti[2]);

        arrayStudenti[2] = "Ninetta";
        // System.out.println(arrayStudenti[2]);

        for (int i = 0; i < arrayStudenti.length; i++ ){
            System.out.println(arrayStudenti[i]);
        }

        int i = 0;
        while ( i<arrayStudenti.length) {
            System.out.println(arrayStudenti[i]);
            i++;
        }
    }
    
}
