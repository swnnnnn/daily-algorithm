package com.algorithm.practice.stack;

import java.util.Scanner;

public class StackTest {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        IntStack s = new IntStack(10);

        while(true) {
            int menu = std.nextInt();

            switch(menu) {
                case 1:
                    try {
                        System.out.print("데이터 : ");
                        s.push(std.nextInt());
                        System.out.print("push completed");
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("stack full!");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("pop data = " + s.pop());
                    } catch (IntStack.EmptyStackException e) {
                        System.out.println("stack empty!");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("peek data = " + s.peek());
                    } catch (IntStack.EmptyStackException e) {
                        System.out.println("stack empty!");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
