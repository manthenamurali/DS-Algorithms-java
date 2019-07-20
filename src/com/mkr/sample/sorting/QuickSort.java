package com.mkr.sample.sorting;

import com.mkr.sample.Util;

/**
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given
 * array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
 *
 * 1. Always pick first element as pivot.
 * 2. Always pick last element as pivot (implemented below)
 * 3. Pick a random element as pivot.
 * 4. Pick median as pivot.
 *
 * The key process in quickSort is partition().
 *
 * Important :
 *  Merge sort is efficient than quick sort, but if space is a constraint then use quick sort. Since merge sort
 *  creates temporary arrays while merging.
 *
 *  "Quick Sort in its general form is an in-place sort (i.e. it doesn’t require any extra storage) whereas merge sort
 *   requires O(N) extra storage, N denoting the array size which may be quite expensive.
 *   Allocating and de-allocating the extra space used for merge sort increases the running time of the algorithm."
 *
 *  So, Quick Sort is preferred over MergeSort for sorting Arrays.
 *  MergeSort is preferred over QuickSort for Linked Lists.
 *
 *  "Merge sort is more efficient and works faster than quick sort in case of larger array size or datasets.
 *   whereas Quick sort is more efficient and works faster than merge sort in case of smaller array size or datasets"
 *
 * Worst case : O(n2)
 * Avg case : O(n * log(n))
 */
public class QuickSort {

    public static void sort(int[] arr, int p, int r) {

        if(p < r) {
            int q = partition(arr, p, r);
            //sort the left of pivot
            sort(arr, p, q - 1);
            //sort the right of pivot
            sort(arr, q + 1, r);
        }
    }

    /**
     * Target of partitions is, given an array and an element x of array as pivot,
     * put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
     * and put all greater elements (greater than x) after x. All this should be done in linear time.
     */
    private static int partition(int[] arr, int p, int r) {

        //pivot is the last element in array
        int pivot = arr[r];
        int i = p - 1;

        for(int j = p; j < r; j++) {
            if(arr[j] <= pivot) {
                i = i + 1;
                Util.swap(arr, i, j);
            }
        }

        //finally swap the pivot and last smallest index and pivot
        Util.swap(arr, i + 1, r);
        return i + 1;
    }
}
