package com.mkr.sample.sorting;

import com.mkr.sample.Util;

/**
 * Step 1 : Scan from 0th index and find the smallest value in the array.
 * Step 2 : Move that smallest value for the 0th index
 * Step 3 : Repeat step 1 from 1st index
 *
 * Repeat till end of the array
 *
 * Best case : 0(n2)
 * Worst case : 0(n2)
 */
public class SelectionSort {

    public void sort(int[] arrayToSort) {

        int length = arrayToSort.length;
        for(int i = 0; i < length; i++) {

            int smallestValue = arrayToSort[i];
            int smallestValueIndex = i;

            for(int j = i; j < length; j++) {

                if(arrayToSort[j] < smallestValue) {

                    smallestValue = arrayToSort[j];
                    smallestValueIndex = j;
                }
            }

            //if no smallest value index is not found, no need to swap
            if(smallestValueIndex != i) {
                Util.swap(arrayToSort, smallestValueIndex, i);
            }
        }
    }
}
