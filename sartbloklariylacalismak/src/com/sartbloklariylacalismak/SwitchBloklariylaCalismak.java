package com.sartbloklariylacalismak;

import java.util.Scanner;

public class SwitchBloklariylaCalismak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Not giriniz : ");

        switch (input.nextLine()) {
            case "A":
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case "B":
                System.out.println("Çok Güzel : Geçtiniz");

            case "C":
                System.out.println("İyi : Geçtiniz");
                break;
            case "D":
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case "F":
                System.out.println("Malesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");
        }
    }
}
