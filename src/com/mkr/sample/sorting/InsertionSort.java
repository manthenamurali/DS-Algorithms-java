package com.mkr.sample.sorting;

import com.mkr.sample.SampleJava;
import com.mkr.sample.Util;

/**
 * In insertion sort we pick a element and compare it with all the elements left to it.
 * If a lesser value is found, then the elements are swapped.
 *
 * ie.. the main array is considered as sorted and unsorted sub-arrays. the sorted array is
 * updated for each iteration.
 *
 * Best case : 0(n2)
 * Worst case : 0(n2)
 */
public class InsertionSort {

    public static void sort(int[] arrayToSort) {

        int len = arrayToSort.length;
        int elementToCompare;
        for(int i = 1; i < len; i++) {

            elementToCompare = arrayToSort[i];
            int indexToSwap = i;

            for(int j = i - 1; j >= 0; j--) {

                if(elementToCompare < arrayToSort[j]) {
                    Util.swap(arrayToSort, indexToSwap, j);

                    //since i is swapped with j, now the elementToCompare is in jth index
                    indexToSwap = j;
                }
            }
        }

    }

    /**
     * This approach is same as above, but instead of swapping we first update the values in index
     * and finally place the current value we are searching.
     *
     * Advantages of this is it used less instructions compared to swap. Time complexities are also same.
     *
     * @param arrayToSort
     */

    public static void sort1(int[] arrayToSort) {

        int i, key, j;
        int len = arrayToSort.length;

        for (i = 1; i < len; i++) {
            key = arrayToSort[i];
            j = i - 1;

            while (j >= 0 && arrayToSort[j] > key) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = key;
        }

    }
}
