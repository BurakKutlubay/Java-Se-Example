package com.example;

import java.util.Scanner;

public class IfElseNumberWriting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Rakam Giriniz : ");

        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Sıfır");
        } else if (number == 1) {
            System.out.println("Bir");
        } else if (number == 2) {
            System.out.println("Iki");
        } else if (number == 3) {
            System.out.println("Uc");
        } else if (number == 4) {

            System.out.println("Dort");
        } else if (number == 5) {
            System.out.println("Bes");
        } else {
            System.out.println("Geçersiz Rakam Girdiniz");
        }
    }
}


