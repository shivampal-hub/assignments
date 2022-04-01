package com.array;

public class SmallestElement {
    public static void main(String[] args) {
        SmallestElement se = new SmallestElement();
        se.smallest();
    }
    public void smallest(){
        int[] a = new int[]{10,30,60,5,80};
        int min = a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Smallest element in the array is : "+min);
    }
}

