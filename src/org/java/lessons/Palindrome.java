package org.java.lessons;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parola = scan.nextLine();
        boolean isPalindroma = isPalindroma(parola);
        if (isPalindroma) {
            System.out.println("La parola " + parola + " è palindroma");
        } else {
            System.out.println("La parola " + parola + " non è palindroma");
        }

    }
    private static boolean isPalindroma(String parola) {
        String parolaInvertita = "";

        for (int i = parola.length() - 1; i >= 0; i--) {
            parolaInvertita += parola.charAt(i);
        }
        return parola.equalsIgnoreCase(parolaInvertita);
    }
}




