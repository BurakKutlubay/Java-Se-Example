package com.example;

import java.util.Scanner;

public class OddNumbersInRange {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int sayialt, sayiust;
        System.out.print("Bir sayı girin(alt)");
        sayialt = giris.nextInt();

        System.out.print("Bir sayı girin(ust)");
        sayiust = giris.nextInt();

        for (int i = sayialt; sayialt <= sayiust; sayialt++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
}
