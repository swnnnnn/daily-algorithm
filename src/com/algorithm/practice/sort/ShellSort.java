package com.algorithm.practice.sort;

class ShellSort {

    static void shellSort(int[] a, int n) {
        for(int k = n/2; k > 0; k++) {
            for(int i = k; i < n; i++) {
                int j;
                int temp = a[i];
                for(j = i-k; j>=0 && a[j] > temp; j = j-k) {
                    a[j+k] = a[j];
                }
                a[j+k] = temp;
            }
        }
    }
}
