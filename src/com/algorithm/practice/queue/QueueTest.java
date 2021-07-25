package com.algorithm.practice.queue;

import java.util.Scanner;

public class QueueTest {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        IntQueue q = new IntQueue(10);

        while(true) {
            int menu = std.nextInt();

            switch(menu) {
                //enque
                case 1:
                    try {
                        System.out.print("데이터 : ");
                        q.enque(std.nextInt());
                        System.out.println("enque completed");
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("Queue full!");
                    }
                    break;
                //deque
                case 2:
                    try {
                        System.out.println("deque data = " + q.deque());
                    } catch (IntQueue.EmptyQueueException e) {
                        System.out.println("Queue empty!");
                    }
                    break;
                //peek
                case 3:
                    try {
                        System.out.println("peek data = " + q.peek());
                    } catch (IntQueue.EmptyQueueException e) {
                        System.out.println("Queue empty!");
                    }
                    break;
            }
        }
    }
}