package com.example;

public class MethodOverloading {

    public static void main(int a , int b) {

        System.out.println("Toplam : " +(a+b));
    }

    public static void main(int a , int b , int c) {
        System.out.println("Toplam: " + (a+b+c));
    }

    public static void main(String[] args) {
        main (5,6,7);
        main(1,8);
    }
}
