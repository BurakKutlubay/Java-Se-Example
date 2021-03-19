package com.example;

import java.util.Scanner;

public class WhileEx {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First Number : ");

        int number1 = input.nextInt();

        System.out.println("Second Number");

        int number2 = input.nextInt();

        int total = 0;

        int i=number1+1;

        while (i < number2) {

            i++;

            if (i % 2 == 0) {

                total = total + i;

            }
        }
        System.out.println("Sum of even numbers between two numbers : " + total);
    }
}
