package com.array;

public class LargestElement {
    public static void main(String[] args) {
        LargestElement le = new LargestElement();
        le.largest();
    }
    public void largest(){
        int[] a= new int[]{10,30,60,20,40};
        int max = a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max)
                max = a[i];
        }
        System.out.println("largest element in the array is : " +max);
    }
}
