package com.mkr.sample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStack<T> {

    private final int DEFAULT_SIZE = 10;
    private final int GROW_SIZE = 10;
    private final int THRESHOLD = 3;

    private int currentStackSize = DEFAULT_SIZE;
    private T[] stack;
    private int top = -1;

    public MyStack() {
        stack = (T[]) new Object[currentStackSize];
    }

    public synchronized void push(T item) {

        ensureCapacity();

        top++;
        stack[top] = item;
    }

    public T pop() {

        if(isEmpty()) {
            throw new RuntimeException("Stack empty!!!");
        }

        return stack[top--];
    }

    private synchronized void ensureCapacity() {

        //ex: if current size is 17 or more, increase the size
        if(currentStackSize - top <= THRESHOLD) {
            System.out.println("Time to increase the stack size. Current inserting at = " + top + " of total size = " + currentStackSize);

            if(currentStackSize >= 10 * DEFAULT_SIZE) {
                throw new RuntimeException("Already increased 10 times. Can't grow further.");
            }

            currentStackSize += GROW_SIZE;
            stack = Arrays.copyOf(stack, currentStackSize);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean hasNext() {
        return top != -1;
    }
}
