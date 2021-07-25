package com.algorithm.practice.search;

import java.util.Arrays;
import java.util.Scanner;

//이진 검색
class BinarySearch {

    static int binarySearch(int[] a, int n, int key) {
        //데이터가 존재하는 인덱스를 알려준다.

        int left = 0; // 검색 범위의 첫 인덱스
        int right = n - 1; // 검색 범위의 끝 인덱스

        do {
            int center = (left + right) / 2;
            if(a[center] == key) {
                return center;
            } else if(a[center] < key) {
                left = center + 1;
            } else {
                right = center - 1;
            }
        } while(left <= right);

        return -1;
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);

        System.out.print("몇개 저장할래? : ");
        int num = std.nextInt();
        int[] x = new int[num];

        System.out.print("x[0] : ");
        x[0] = std.nextInt();

        for(int i = 1; i<num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = std.nextInt();
            } while(x[i] < x[i-1]); // 이전 인덱스 값보다 커야함
        }

        System.out.print("검색할 값은? : ");
        //int index = binarySearch(x, num, std.nextInt());
        int index = Arrays.binarySearch(x, std.nextInt()); // 자바에서 제공

        if(index == -1) {
            System.out.println("데이터가 없습니다.");
        } else {
            System.out.println(index + "번째에 데이터가 있습니다.");
        }
    }
}
