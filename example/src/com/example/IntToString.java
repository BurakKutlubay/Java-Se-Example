package com.example;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Rakam Giriniz : ");

        int number = input.nextInt();


        switch (number) {
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            default:
                System.out.println("Geçersiz Rakam Girdiniz");
        }
    }
}



