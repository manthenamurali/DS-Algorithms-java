package com.mkr.sample;

public class Examples {

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
