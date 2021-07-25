package com.algorithm.practice.sort;

import java.util.Scanner;

class InsertionSort {
    static void insertionSort(int[] a, int n) {
        for(int i = 0; i < n; i++) {
            int j;
            int temp = a[i];
            for(j = i; j > 0 && a[j-1] > temp; j--) {
                a[j] = a[j-1];
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        //몇개 저장할래? : 5
        //a[0] : 3
        //a[1] : 5
        //a[2] : 4
        //a[3] : 2
        //a[4] : 1
        //a[0] : 1
        //a[1] : 2
        //a[2] : 3
        //a[3] : 4
        //a[4] : 5
        Scanner std = new Scanner(System.in);

        System.out.print("몇개 저장할래? : ");
        int size = std.nextInt();
        int[] a = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = std.nextInt();
        }

        insertionSort(a, size);

        for(int i=0; i<size; i++)
            System.out.println("a[" + i + "] : " + a[i]);
    }
}