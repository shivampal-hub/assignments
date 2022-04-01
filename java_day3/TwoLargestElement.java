package com.array;

public class TwoLargestElement {
    public static void main(String[] args) {
        TwoLargestElement le = new TwoLargestElement();
        le.largest();
    }
    public void largest() {
        int w, x, y;
        int[] a = new int[]{10, 30, 60, 5, 100};
        int as;
        System.out.println("Second Largest Element : ");
        int i;
        for (i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    as = a[i];
                    a[i] = a[j];
                    a[j] = as;
                }
            }
        }
        System.out.println(" " + a[i - 2]);
    }
}