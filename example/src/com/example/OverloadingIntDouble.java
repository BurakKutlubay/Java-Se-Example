package com.example;

public class OverloadingIntDouble {
    public static void main(String[] args) {

        int sonuc1 = ortlamaHesapla(20,10);
        int sonuc2 = ortamaHesapla(5,10,15);
        double sonuc3 = orlamaHesapla(7.5,8.0);
        double sonuc4 = ortalamaHesapla(12.3,15.5,17.8);
        System.out.println("Birinci Sonuç : " + sonuc1);
        System.out.println("Ikınci Sonuç : " + sonuc2 );
        System.out.println("Ucuncü Sonuç : " + sonuc3 );
        System.out.println("Dorduncu Sonuç : " + sonuc4 );
    }

    private static int ortlamaHesapla(int deger1, int deger2) {
        return (deger1+deger2)/2;
    }

    private static int ortamaHesapla(int deger1, int deger2, int deger3) {
        return (deger1+deger2+deger3)/3;
    }

    private static double orlamaHesapla(double deger1, double deger2) {
        return (deger1+deger2)/2;
    }

    private static double ortalamaHesapla(double deger1, double deger2, double deger3) {
        return (deger1+deger2+deger3)/3;
    }

}
