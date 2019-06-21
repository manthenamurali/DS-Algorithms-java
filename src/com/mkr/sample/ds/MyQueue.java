package com.mkr.sample.ds;

public class MyQueue {

    private final int MAX_SIZE = 30;

    private int[] arr = new int[MAX_SIZE];
    private int front = 0;
    private int rear = -1;

    public void push(int element) {

        if(rear + 1 >= MAX_SIZE) {
            System.out.println("Reached max queue size.. Cannot insert further");
            return;
        }

        rear ++;
        arr[rear] = element;
    }

    public int pop() {

        if(front > getSize()) {
            System.out.println("No more elements to pop.");
            return -1;
        }

        return arr[front++]; //observe the post increment
    }

    public int getSize() {
        return rear == 1 ? 0 : rear;
    }
}
