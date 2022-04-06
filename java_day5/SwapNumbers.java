package com.basic;

import java.util.Scanner;

public class SwapNumbers {
    static int a,b,c;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(+a+" "+b);
        swap();
    }
    public static void swap(){
        c=a;
        a=b;
        b=c;
        System.out.println(+a+" "+b);
    }
}
