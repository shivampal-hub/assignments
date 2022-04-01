package com.array;

public class DuplicateElement {
    public static void main(String[] args) {
        DuplicateElement de = new DuplicateElement();
        de.duplicate();
    }

    public void duplicate() {
        int[] a = new int[]{10, 20, 10};
        int duplicate = a[0];
        System.out.println("Duplicate element in the array is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicate = a[j];
                    System.out.println(" " + duplicate);
                }
            }
        }
    }
}
