package com.sitringlerlecalismak;

public class SitringlerleCalismak1 {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel."; //string değişkeni oluşturup içerisine atama yapıldı

        System.out.println(mesaj);//mesaj değişkeni ekrana yazıldı

        System.out.println("Eleman sayısı : " + mesaj.length());//mesaj değişkeninin boyutu ekrana yazıldı

        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın!"));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("e"));

    }

}
