package com.mkr.sample.searching;

/**
 * Efficient way to search, but the input array HAS to be sorted.
 * If not sorted then use the linear search.
 *
 * Logic :
 * 1. Find the mid point of the array
 * 2. Check if the item belongs to left or right of mid point (can also be the mid item)
 * 3. Get the left or right array
 * 4. Repeat step 1
 *
 *  Best case : O(1)
 *  Worst case : O(log n)
 *    With a binary search, you eliminate 1/2 the possible entries each iteration,
 *    For 128 item we need at most 7 compares (log base 2 of 128 is 7 or 2 to the 7 power is 128.)
 *
 */
public class BinarySearch {

    /**
     * int[] arr = new int[10];
     *
     * //for(int i = 0; i < arr.length; i++) {
     * //    arr[i] = i;
     * // }
     *
     *  arr =new int[] { 3, 7, 14, 20, 29, 30, 45, 63, 78, 85, 99 };
     *
     * System.out.println(BinarySearch.findIndex(arr,30));

     * @param items sorted array of item
     * @param valueToFind item who's index has to be found
     *
     * @return -1 if not found, else the index of valueToFind
     */
    public static int findIndex(int[] items, int valueToFind) {
        return search(items, valueToFind, 0, items.length - 1);
    }

    private static int search(int[] items, int valueToFind, int start, int end) {
        //System.out.println("start = " + start + " end = " + end);

        if(start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        int midValue = items[mid];

        if(midValue == valueToFind) {
            return mid;
        }

        if(valueToFind < midValue) {
            end = mid - 1; //value is less than mid, so search the left of mid
        } else {
            start = mid + 1; //greater, so search the right of mid to end
        }

        return search(items, valueToFind, start, end);
    }
}
