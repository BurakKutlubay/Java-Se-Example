package com.example;

public class OverloadingFloat {
        void disp(int a, double b){
            System.out.println("Method A");
        }
        void disp(int a, double b, double c){
            System.out.println("Method B");
        }
        void disp(int a, float b){
            System.out.println("Method C");
        }
        public static void main(String args[]){
            OverloadingFloat obj = new OverloadingFloat();

            obj.disp(100, 20.67f);
        }
}
