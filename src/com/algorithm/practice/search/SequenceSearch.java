package com.algorithm.practice.search;

import java.util.Scanner;

//선형 검색
class SequenceSearch {

    static int sequenceSearch(int [] a, int n, int key) {
        int j = 0;
        a[n] = key; // 보초

        for(int i=0; i<n; i++){
            j = i;
            if (a[i] == key)
                //return i;
                break;
        }
        //return -1;
        return j == n? -1 : j;
    }

    public static void main(String[] args) {
        //몇개까지 저장할래? : 2
        //1
        //2
        //검색할 값은? : 2
        //2은 x[1]에 있습니다.

        Scanner std = new Scanner(System.in);

        System.out.print("몇개까지 저장할래? : ");
        int num = std.nextInt();

        //int[] x = new int[num];
        int[] x = new int[num + 1];

        for(int i=0; i<num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = std.nextInt();
        }

        System.out.print("검색할 값은? : ");
        int keyValue = std.nextInt();

        int index = sequenceSearch(x, num, keyValue);

        if (index == -1) {
            System.out.println("값이 없습니다.");
        } else {
            System.out.println(keyValue + "은(는) x[" + index + "]에 있습니다.");
        }
    }
}
