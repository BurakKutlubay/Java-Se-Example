package com.example;

import java.util.Scanner;

public class BasHarfleriBuyutme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("isim giriniz : ");

        String mesaj = input.nextLine();

       // System.out.println(mesaj.replace("b","a"));

        // mesaj=mesaj.replace("b","a");


        //mesaj = mesaj.toLowerCase();

        mesaj = mesaj.substring(0, 1).toUpperCase() + mesaj.substring(1).toLowerCase();

        //mesaj = Character.toUpperCase(mesaj.charAt(0))+mesaj.substring(1);

      /*  for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
            System.out.println(kelime.substring(0, 1).toUpperCase());
            mesaj.replace(kelime,kelime.substring(0, 1).toUpperCase() );
            System.out.println(kelime);
        }  */

      /*  for(String kelime : mesaj.split("a")) {
            mesaj = mesaj.replace(kelime, kelime.substring(0, 1).toUpperCase() + kelime.substring(1));
        }  */



        //mesaj = Character.toUpperCase(mesaj.charAt(0))+mesaj.substring(1);


        System.out.println(mesaj);


        //System.out.println("Büyük harf yazımı : " +mesaj.toUpperCase());


    }



}
