package com.example;

public class StringEx {

    public static void main(String[] args) {

        // string tanımlanması
        String st1[]={"ankara","antalya","burdur","bursa","anadolu"};

        int i;

        for (i=0; i<st1.length; i++) {

            if(st1[i].startsWith("an")) {

                System.out.println();

                System.out.println(st1[i]+" stringi an  starts with the letters");
            }
        }
        System.out.println();

        for (i=0; i<st1.length; i++) {

            if(st1[i].endsWith("a")) {
                System.out.println();
                System.out.println(st1[i]+" stringi a  begins with the letter");
            }
        }
        System.out.println();

        for (i=0; i<st1.length; i++) {

            if(st1[i].startsWith("ka",2))
            {
                System.out.println();
                System.out.println(st1[i]+" stringi 2. from index ka starts with the letters");
            }

        }

    }

}




