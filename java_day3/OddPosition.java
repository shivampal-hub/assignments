package com.array;

public class OddPosition {
    public static void main(String[] args) {
        OddPosition op = new OddPosition();
        op.odd();
    }
    public void odd(){
        int[] a = new int[]{10,30,60,5,80,100};
        int odd = a[0];
        System.out.println("Elements at odd position : ");
        for (int i=1;i<a.length;i+=2){

            odd = a[i];
            System.out.println(" "+odd);
        }
    }
}
