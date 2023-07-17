package org.java.lessons;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero a quattro cifre");
        int number = scan.nextInt();
        int sum = 0;
        while (number > 0) {
            sum = sum + number%10;
            number= number/10;
        }
        System.out.println(sum);
    }
}




