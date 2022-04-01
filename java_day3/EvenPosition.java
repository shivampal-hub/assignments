package com.array;

public class EvenPosition {
        public static void main(String[] args) {
            EvenPosition ep = new EvenPosition();
            ep.even();
        }
        public void even(){
            int[] a = new int[]{10,30,60,5,80};
            int even = a[0];
            System.out.println("Elements at even position : ");
            for (int i=0;i<a.length;i+=2){

                    even = a[i];
                System.out.println(" "+even);
                }
        }
    }
