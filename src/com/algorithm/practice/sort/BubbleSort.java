package com.algorithm.practice.sort;

import java.util.Scanner;

class BubbleSort {
    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    static void bubbleSort(int[] a, int n) {
        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) {
                //이중 반복문
                if(a[j-1] > a[j])
                    swap(a, j - 1, j);
            }
        }
    }

    static void bubbleSort2(int[] a, int n) {
        for(int i=0; i<n-1; i++) {
            int exchange = 0;
            for(int j=n-1; j>i; j--) {
                if(a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    exchange++;
                }
                if(exchange == 0) break;
            }
        }
    }

    static void bubbleSort3(int[] a, int n) {
        int k = 0;
        while(k < n-1) {
            int last = n-1;
            for(int j=n-1; j>k; j--) {
                //이중 반복문
                if(a[j-1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
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

        bubbleSort3(a, size);

        for(int i=0; i<size; i++)
            System.out.println("a[" + i + "] : " + a[i]);
    }
}