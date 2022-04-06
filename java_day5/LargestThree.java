package com.basic;

import java.util.Scanner;

public class LargestThree {
    static int a, b, c;

    public static void main(String[] args) {
        System.out.println("Enter value of a,b and c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        LargestThree lt = new LargestThree();
        lt.largest();
    }

    void largest() {
        if ((a > b) && (a > c)) {
            System.out.println(+a+" is Largest");
        } else if ((b > a) && (b > c)) {
            System.out.println(+b+" is Largest");
        } else {
            System.out.println(+c+" is Largest");
        }
    }
}