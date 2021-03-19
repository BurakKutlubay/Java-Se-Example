package com.example;

import javax.xml.transform.Result;
import java.util.Scanner;

public class TernaryOpEX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayi giriniz");

        int result =0;

        result = input.nextInt() > 15 ? 10 : 20;
        System.out.println(result);



    }



}
