package org.lessons.java.basics;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        int [] numbers = new int[15];

        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
            //System.out.println(numbers[i]);
            
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi il numero che vuoi cercare nell'array");
        int userNumber = sc.nextInt();
        sc.close();

        int index = 0;
        boolean isNumberFound = false;
        while (index < numbers.length && !isNumberFound) {
            if (numbers[index] == userNumber){
                isNumberFound = true;
            } else {
                index++;
            }
        }

        if (isNumberFound) {
            System.out.println("Il numero e' stato trovato al posto " + index);
        } else {
            System.out.println("Il numero non è stato trovato nell'array");
        }

        
        
    }
}
