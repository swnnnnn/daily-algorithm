package com.algorithm;

public class Practice1 {

    public static void main(String args[]) {
        triangle();

        int[] a = {20, 39, 5, 10, 11};
        bubblesort2(a, a.length);

        int index = 0;
        for(int b : a) {
            System.out.println("x[" + index + "] = " + b);
            index++;
        }
    }

    public static void triangle() {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    //오름차순 정렬
    public static void bubblesort(int[] a, int n) {
        for(int i=0; i<n-1; i++) {
            int exchange = 0;
            for(int j=n-1; j>i; j--) {
                if(a[j-i] > a[j]) {
                    swap(a, j - 1, j);
                    exchange++;
                }
            }
            if(exchange == 0)
                break;
        }
    }

    public static void bubblesort2(int[] a, int n) {
        int k = 0;

        while (k < n-1) {
            int last = n-1;
            for(int j=n-1; j>k; j--) {
                if(a[j-1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }

    public static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}