package com.siaod.lec2;

public class InsertionSort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (Sort.less(a[j], a[j-1]))
                    Sort.exch(a, j, j-1);
                else
                    break;
            }
        }
    }
}
