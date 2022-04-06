package com.basic;

import java.util.Scanner;

public class HarmonicNumber {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n=sc.nextInt();
        HarmonicNumber hn = new HarmonicNumber();
        hn.harmonic();
    }
    public void harmonic(){
        float y = 1;
        for (int i=2;i<=n;i++){
            y+=(float) 1/i;
        }
        System.out.println(""+y);
    }
}
