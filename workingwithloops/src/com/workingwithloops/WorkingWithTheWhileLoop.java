package com.workingwithloops;

public class WorkingWithTheWhileLoop {

    public static void main(String[] args) {
        int i=2;
        while(i<10){ //i=20 vermiş olsan while dongusune hic girmeyecek
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Dongusu Bitti");

        //Do-While
        int j=1; //do while da ise sart uymasa bile bir kere calisicak
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While Dongusu Bitti");
    }
}



