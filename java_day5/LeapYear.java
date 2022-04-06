package com.basic;

import java.util.Scanner;

public class LeapYear {
    static int year;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year to check Leap year");
        year = s.nextInt();
        leap();
    }
    public static void leap() {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
