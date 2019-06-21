package com.mkr.sample;

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

    public static void isAnagram(String a, String b) {

        if(a.length() != b.length()) {
            System.out.println("Not Anagram");
            return;
        }

        String newA = a.toLowerCase();
        String newB = b.toLowerCase();

        int sumA = 0;
        int sumB = 0;

        for(int i = 0; i<newA.length(); i++) {
            sumA = sumA + newA.charAt(i);
            sumB = sumB + newB.charAt(i);
        }

        System.out.println(sumA == sumB ? "Anagram" : "Not Anagram");
    }
}

