package com.array;

public class ReverseOrder {
    public static void main(String[] args) {
        ReverseOrder ro = new ReverseOrder();
        ro.reverse();
    }
    public void reverse(){
        int[] a = new int[]{10,30,60,5,80,100};
        int reverse = a[0];
        System.out.println("Elements in Reverse order : ");
        for (int i = a.length-1; i >= 0; i--){

            reverse = a[i];
            System.out.println(" "+reverse);
        }
    }
}
