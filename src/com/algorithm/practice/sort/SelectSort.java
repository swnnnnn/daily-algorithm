package com.algorithm.practice.sort;

import java.util.Scanner;

class SelectSort {
    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    static void selectSort(int[] a, int n) {
        for(int i = 0; i < n-1; i++) {
            int min = i;

            for(int j = i+1; j < n; j++) {
                if(a[j] < a[min]) { // 0번째보다 더 작으면 j번째를 min으로
                    min = j;
                }
            }
            
            swap(a, i, min); // i랑 j랑 바꿈
        }
    }

    public static void main(String[] args) {
        //몇개 저장할래? : 5
        //a[0] : 29
        //a[1] : 33
        //a[2] : 1
        //a[3] : 10
        //a[4] : 2
        //a[0] : 1
        //a[1] : 2
        //a[2] : 10
        //a[3] : 29
        //a[4] : 33

        Scanner std = new Scanner(System.in);

        System.out.print("몇개 저장할래? : ");
        int size = std.nextInt();
        int[] a = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = std.nextInt();
        }

        selectSort(a, size);

        for(int i=0; i<size; i++)
            System.out.println("a[" + i + "] : " + a[i]);
    }
}
