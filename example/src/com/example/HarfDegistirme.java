package com.example;

import java.util.Scanner;

public class HarfDegistirme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cümle giriniz : ");

        String mesaj = input.nextLine();

        System.out.println(mesaj.replace('i', 'I'));



    }

}
