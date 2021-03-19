package com.example;

import java.util.Scanner;

public class TernaryOperatorEx {
    public static void main(String[] args) {

        int i=1;
        int j=5;

     /*   if(i==1)
            j=6;
        else
            j=7;*/

        j = i==1?6:7;
        System.out.println(j);
    }
}
