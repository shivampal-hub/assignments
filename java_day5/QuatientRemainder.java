package com.basic;

import java.util.Scanner;

public class QuatientRemainder {
    static int a,b,q,r;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of dividend: ");
        a=sc.nextInt();
        System.out.println("Enter value of divisor: ");
        b=sc.nextInt();
        QuatientRemainder qr = new QuatientRemainder();
        qr.quotient();
        qr.remainder();
    }
    void quotient(){
        q=a/b;
        System.out.println("Quotient: "+q);
    }
    void remainder(){
        r=a%b;
        System.out.println("remainder: "+r);
    }
}
