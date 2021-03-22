package com.workingwithclass3ex;

public class Main {
    public static void main(String[] args) {
        InterfaceExClass3 InterfaceExLesson3 = new InterfaceExClass3(false,false);
        InterfaceExLesson3.askerlik_durumu_sorgulama();
        System.out.println(InterfaceExLesson3.mezuniyet_ortalamasi(3.07));
        String[] tecrübe = {"Vestel","Havelsan"};

        InterfaceExLesson3.is_tecrübesi((tecrübe));

    }
}
