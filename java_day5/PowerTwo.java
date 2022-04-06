package com.basic;

import java.util.Scanner;

public class PowerTwo {
    static int N,y = 1;

    public static void main(String[] args) {
        N = Integer.parseInt(args[0]);
        power();
    }

    public static void power() {
        for (int i = 0; i <= N; i++) {
            if (i == 0) {
                System.out.println("1");
            } else {
                y = y * 2;
                System.out.println("" + y);
            }
        }
    }
}
