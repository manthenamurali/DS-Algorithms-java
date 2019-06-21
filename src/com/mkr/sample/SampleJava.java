package com.mkr.sample;

import com.mkr.sample.ds.MyQueue;

public class SampleJava {

    public static void main(String[] args) {
        System.out.println("Hello, Murali!!!");

        MyQueue q = new MyQueue();

        for(int i=1; i<= 15; i++) {
            q.push(i + 200);
        }

        for(int i=1; i<=20 ; i++) {
            System.out.println(q.pop());
        }
    }

}

