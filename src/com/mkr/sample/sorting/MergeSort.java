package com.mkr.sample.sorting;

import java.util.Arrays;

/**
 * Merge Sort is a Divide and Conquer algorithm.
 * It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
 *  The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the
 *  two sorted sub-arrays into one.
 *
 *  Time complexity : O(n * log(n))
 *
 *    Since we are splitting the arrays : log(n) and also iterating through n times all the temp sub-arrays
 *    so n times log(n)
 */
public class MergeSort {

    public static void sort(int[] arrayToSort, int p, int r) {

        if (p < r) {
            int mid = (p + r) / 2;
            sort(arrayToSort, p, mid);
            sort(arrayToSort, mid + 1, r);
            merge(arrayToSort, p, mid, r);
        }
    }

    private static void merge(int[] arr, int p, int q, int r) {

        int leftArrLen = q - p + 1;
        int rightArrLen = r - q;

        int[] leftArr = Arrays.copyOfRange(arr, p, q + 1);
        int[] rightArr = Arrays.copyOfRange(arr, q + 1, r + 1);

        int i = 0;
        int j = 0;
        int k = p; //this is very imp, consider from the start index in the main array

        while (i < leftArrLen && j < rightArrLen) {

            //move the smallest in the temp arrays to the main array
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }

            k++;
        }

        //copy any leftovers back to the main array
        while (i < leftArrLen) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArrLen) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
