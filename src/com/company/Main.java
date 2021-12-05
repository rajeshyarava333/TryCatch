package com.company;

public class Main {

    public static void main(String[] args) {
        int z=0;
        try{
            int x=8;
            int y=0;
            z=x/y;
            System.out.println(z);
        }catch(ArithmeticException ae){
            z=10;
            System.out.println("catch block z value is "+z);
        }finally{
            z=20;
            System.out.println("finally block z value is "+z);
        }
    }
}
