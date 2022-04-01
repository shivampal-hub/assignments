package com.array;

public class SortAscending {
    public static void main(String[] args) {
        SortAscending sa = new SortAscending();
        sa.ascending();
    }

    public void ascending() {
        int w, x, y;
        int[] a = new int[]{10, 30, 60, 5, 80, 100};
        int as;
        System.out.println("Elements in Ascending order : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    as = a[i];
                    a[i] = a[j];
                    a[j] = as;
                }
            }
        }
        for(int i=0;i<a.length; i++){
            System.out.println(" "+a[i]);
        }
    }
}

