package com.mkr.sample.searching;

import java.util.Random;

/**
 * Not effective way of searching the index but commonly used.
 * Array is not sorted. (If we know array is sorted use binary search).
 *
 * Logic : Iterate through all the item to find the index
 *
 * Best case : O(1)
 * Worst case : O(n)
 */
public class LinearSearch {

    /*
        Usage :

        int[] arr = new int[100];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(LinearSearch.getIndexForItem(arr, 25));

        return -1, if not found
    */
    public static int getIndexForItem(int[] items, int valueToSearch) {

        int index = -1;
        for(int i =0; i < items.length; i++) {
            if(items[i] == valueToSearch) {
                index = i;
                break;
            }
        }

        return index;

    }
}
