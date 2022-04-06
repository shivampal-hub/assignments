package com.basic;

import java.util.Scanner;

public class Distance {
    static int x, y;
    static double distance, d;
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter value of x co-ordinate: ");
        x=Integer.parseInt(args[0]);
        //x = sc.nextInt();
        //System.out.println("x: "+x);
        //System.out.println("Enter value of y co-ordinate: ");
        y=Integer.parseInt(args[1]);
        //y = sc.nextInt();
        //System.out.println("y: "+y);
        euclidean();
    }
    public static void euclidean(){
        d = (x*x) + (y*y);
        distance = Math.pow(d, 0.5);
        System.out.println("Euclidean Distance is: "+distance);
    }
}
