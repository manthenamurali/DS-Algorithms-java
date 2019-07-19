package com.mkr.sample.sorting;

import com.mkr.sample.Util;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in wrong order.
 *
 * Worst case : O(n2)
 */
public class BubbleSort {

    public static void sort(int[] arrayToSort) {

        int len = arrayToSort.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if(arrayToSort[j] > arrayToSort[j + 1]) {
                    Util.swap(arrayToSort, j, j + 1);
                }
            }
        }
    }
}
AS