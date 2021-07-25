package com.algorithm.practice.sort;

import java.util.Scanner;

class QuickSort {

    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    static void quickSort(int[] a, int left, int right) {
        int pl = left; // 왼쪽커서
        int pr = right; // 오른쪽커서
        int x = a[(pl + pr) / 2]; // 피벗

        //a[0]~a[8] : {5 , 8 , 4 , 2 , 6 , 1 , 3 , 9 , 7}
        //a[0]~a[4] : {5 , 3 , 4 , 2 , 1}
        //a[0]~a[2] : {1 , 3 , 2}
        //a[0]~a[1] : {1 , 2}
        //a[3]~a[4] : {4 , 5}
        //a[5]~a[8] : {6 , 8 , 9 , 7}
        //a[5]~a[6] : {6 , 7}
        //a[7]~a[8] : {9 , 8}

        //a[0]~a[8] : {5 , 8 , 4 , 2 , 6 , 1 , 3 , 9 , 7}
        //a[0]~a[4] : {5 , 3 , 4 , 2 , 1}   a[5]~a[8] : {6 , 8 , 9 , 7}
        //a[0]~a[2] : {1 , 3 , 2}   a[3]~a[4] : {4 , 5}   a[5]~a[6] : {6 , 7}   a[7]~a[8] : {9 , 8}
        //a[0]~a[1] : {1 , 2}

        System.out.printf("a[%d]~a[%d] : {", left, right);
        for(int i=left; i<right; i++)
            System.out.printf("%d , ", a[i]);
        System.out.printf("%d}\n", a[right]);

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;

            if(pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);

        if(left < pr) quickSort(a, left, pr);
        if(pl < right) quickSort(a, pl, right);
    }

    public static void main(String[] args) {
        //몇개 저장할래? : 9
        //a[0] : 5
        //a[1] : 8
        //a[2] : 4
        //a[3] : 2
        //a[4] : 6
        //a[5] : 1
        //a[6] : 3
        //a[7] : 9
        //a[8] : 7

        Scanner std = new Scanner(System.in);

        System.out.print("몇개 저장할래? : ");
        int size = std.nextInt();
        int[] a = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = std.nextInt();
        }

        quickSort(a, 0, size-1);

        for(int i=0; i<size; i++)
            System.out.println("a[" + i + "] : " + a[i]);
    }
}
