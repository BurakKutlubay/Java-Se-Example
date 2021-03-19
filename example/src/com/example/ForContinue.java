package com.example;

public class ForContinue {
    public static void main(String[] args) {
        int[] sayilar = {52, 5, 10, 75, 65, 10, 12, 7, 4, 36, 29, 12};

        for (int sayi : sayilar) {

            if (sayi % 2 == 0)
                continue;
            System.out.println(sayi);


        }

    }
}
