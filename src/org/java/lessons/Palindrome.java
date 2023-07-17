package org.java.lessons;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        double somma = 0;
        double media;


        for (int i = 1; i < 11; i++) {
            somma += i;
        }
        System.out.println(" la somma dei primi numeri è " + somma);


        media = somma / 10;
        System.out.println("la media dei numeri è " + media);
    }
}








