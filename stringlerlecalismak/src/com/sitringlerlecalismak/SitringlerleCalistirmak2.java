package com.sitringlerlecalismak;

import java.util.Locale;

public class SitringlerleCalistirmak2 {

    public static void main(String[] args) {

        String mesaj = "Bügün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj);
        System.out.println(mesaj.substring(2,5));

        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); //tüm harfleri büyütür
        System.out.println(mesaj.toUpperCase());//tüm harfleri küçültür
        System.out.println(mesaj.trim());
    }

}
