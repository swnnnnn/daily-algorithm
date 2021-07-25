package com.algorithm.practice.sort;

import java.util.Scanner;

class MergeSort {

    //작업 배열
    static int[] buff;

    //재귀적으로 병합 정렬
    static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left+right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            mergeSort(a, left, center); // 앞부분을 병합 정렬
            mergeSort(a, center+1, right); // 뒷부분을 병합 정렬

            for(i = left; i<=center; i++)
                buff[p++] = a[i]; // 배열 앞부분 buff에 복사

            while(i<=right && j<p)
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++]; // 배열 뒷부분과 buff의 앞부분을 병합

            while (j < p)
                a[k++] = buff[j++]; // buff에 남아있는거 a로 복사
        }
    }

    //병합정렬
    static void mergeSort(int[] a, int n) {
        buff = new int[n]; // 배열 생성
        mergeSort(a, 0, n-1); // 배열 전체 병합 정렬
        buff = null;
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

        mergeSort(a, size);

        for(int i=0; i<size; i++)
            System.out.println("a[" + i + "] : " + a[i]);
    }
}
