package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        int a1 = sk.nextInt();
        int d = sk.nextInt();
        int n = sk.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.println(a1 +(i-1)*d);

        }


    }
}