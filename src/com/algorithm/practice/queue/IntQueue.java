package com.algorithm.practice.queue;

public class IntQueue {

    private int max; // 큐 용량
    private int front; // 첫번째 커서
    private int rear; // 마지막 커서
    private int num; // 현재 데이터 수
    private int[] queue; // 큐

    public class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() {}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;

        try {
            queue = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max) {
            throw new OverflowIntQueueException();
        }

        queue[rear++] = x;
        num++;

        if(rear == max) {
            rear = 0;
        }
        return x;
    }

    public int deque() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        }

        int x = queue[front++];
        num--;

        if(front == max) {
            front = 0;
        }
        return x;
    }
    
    public int peek() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        }
        return queue[front];
    }

    public int indexOf(int x) {
        for (int i=0; i<num; i++) {
            int index = (i + front) % max;
            if (queue[index] == x) {
                return index;
            }
        }
        return -1;
    }
}