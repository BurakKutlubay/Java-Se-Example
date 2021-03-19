package com.example;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {



        String metin = "Merhaba dünya bu java örnekleri";
        char karakter = 'e';
        int tane = 0;

        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
            }
        }

        System.out.println( karakter + " yazı içinde  " + tane +" tanedir");
    }
}
