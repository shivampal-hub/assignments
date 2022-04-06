package com.basic;

import java.util.Scanner;

public class EvenOdds {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find even or odd : ");
        n=sc.nextInt();
        even();
    }
    public static void even(){
        if(n%2==0){
            System.out.println("even: "+n);
        }
        else
            System.out.println("Odd: "+n);
    }
}
