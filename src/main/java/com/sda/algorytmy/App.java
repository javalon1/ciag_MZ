package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Podaj pierwszy wyraz ciągu:");
        int a = sk.nextInt();
        System.out.println("Podaj dlugosc ciagu: ");
        int n = sk.nextInt();
        System.out.println("Podaj przyrost:");
        int d = sk.nextInt();

        for (int i = 2; i <= n; i++) {
            int next = a + (i - 1) * d;
            System.out.println(next);

        }


    }
}