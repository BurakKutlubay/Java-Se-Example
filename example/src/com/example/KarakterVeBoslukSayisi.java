package com.example;

import java.util.Scanner;

public class KarakterVeBoslukSayisi {

    public static void main(String[] args) {

        String mesaj;
        Scanner input = new Scanner(System.in);
        System.out.println("Cümle giriniz : ");
        mesaj = input.nextLine();
        System.out.println("Karakter sayisi : " + mesaj.length());

        int sayac=0;

        for(int i=0;i<mesaj.length();i++){
            if(mesaj.charAt(i)==' ')sayac++;
        }
        System.out.println("Boşluk sayısı : " +sayac);

    }
}
