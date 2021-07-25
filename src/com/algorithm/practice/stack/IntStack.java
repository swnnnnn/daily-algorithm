package com.algorithm.practice.stack;

public class IntStack {

    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyStackException extends RuntimeException {
        public EmptyStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max) {
            throw new OverflowIntStackException();
        }

        return stk[ptr++] = x;
    }

    public int pop() throws EmptyStackException {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }

        return stk[--ptr];
    }

    public int peek() throws EmptyStackException {
        //pop 했을 때, 가져올 수 있는 데이터 값을 볼 수 있음
        if (ptr <= 0) {
            throw new EmptyStackException();
        }

        return stk[ptr-1];
    }

    public int indexOf(int x) {
        for (int i = ptr-1; i >= 0; i--) {
            if(stk[i] == x) {
                return i;
            }
        }
        return -1; // 실패
    }

    public void dump() {
        if (ptr == 0) {
            System.out.println("stack empty!");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.println(stk[i] + ", ");
            }
        }
    }

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;

        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }
}
