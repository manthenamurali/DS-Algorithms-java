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


    public static void getTagContent(String input) {

        char[] chars = input.toCharArray();

        StringBuffer sb = new StringBuffer();
        StringBuffer contentBuffer = new StringBuffer();

        boolean startTagStarted = false;
        boolean endTagStarted = false;
        boolean readContent = false;

        boolean anyTagsFound = false;

        String currentTag = null;

        for(char c : chars) {

            if(c == '<') {
                startTagStarted = true;
                endTagStarted = false;
                readContent = false;
                continue;
            }

            if(startTagStarted && c == '/') {
                startTagStarted = false;
                endTagStarted = true;
                continue;
            }

            if(c == '>') {

                if(startTagStarted) {
                    startTagStarted = false;

                    currentTag = sb.toString();
                    sb.setLength(0);

                    contentBuffer.setLength(0);
                    readContent = true;

                } else if(endTagStarted) {

                    endTagStarted = false;
                    //System.out.println("currentTag --> " + currentTag);
                    //System.out.println("new tag --> " + sb.toString());

                    if(currentTag != null && currentTag.length() > 0
                            && contentBuffer.toString().length() > 0
                            && currentTag.equals(sb.toString())) {
                        System.out.println(contentBuffer.toString());
                        anyTagsFound = true;
                    }

                    sb.setLength(0);
                    contentBuffer.setLength(0);
                    currentTag = null;
                }

                continue;
            }

            if(startTagStarted || endTagStarted) {
                sb.append(c);
            }

            if(readContent) {
                contentBuffer.append(c);
            }
        }

        if(!anyTagsFound) {
            System.out.println("None");
        }
    }
}
