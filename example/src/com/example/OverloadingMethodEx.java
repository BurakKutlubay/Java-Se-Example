package com.example;

public class OverloadingMethodEx {
    public static void puanHesapla(String isim , int puan) {

        System.out.println(isim  + " adlı yarışmacının " + puan + " puanı var");
    }

    public static void puanHesapla(int puan) {
        System.out.println("İsimsiz yarışmacının puanı: "+puan);
    }

    public static void puanHesapla(String isim) {
        System.out.println(isim + " adlı yarışmacının puanı blunamadı. ");
    }

    public static void main(String[] args) {
        puanHesapla("Kaya");
        puanHesapla(75);
        puanHesapla("Kaya",100);
    }
}
