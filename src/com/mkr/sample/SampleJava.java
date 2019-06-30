package com.mkr.sample;

import com.mkr.sample.ds.MyLinkedList;
import com.mkr.sample.ds.MyQueue;
import com.mkr.sample.generics.DownloadTask;
import com.mkr.sample.generics.Task;
import com.mkr.sample.generics.TaskExecutor;
import com.mkr.sample.searching.BinarySearch;
import com.mkr.sample.searching.LinearSearch;
import com.mkr.sample.sorting.InsertionSort;
import com.mkr.sample.sorting.SelectionSort;

import java.util.LinkedList;
import java.util.Random;

public class SampleJava {

    public static void main(String[] args) {
        System.out.println("Hello, Murali!!!");

       // Examples.getTagContent("<>hello</>");

        int[] arr = new int[10];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        System.out.println();
        System.out.println("Before sorting...");
        printArr(arr);
        System.out.println();


        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort1(arr);

        System.out.println();
        System.out.println("After sorting...");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void genericSample() {

        DownloadTask task = new DownloadTask();

        DownloadTask.Request request = new DownloadTask.Request("www.google.com", "hello.txt");

        new TaskExecutor().executeTask(task, request,
                new Task.ResponseCallback<DownloadTask.Response>() {

                    @Override
                    public void onSuccess(DownloadTask.Response response) {
                        System.out.println("onSuccess : response = " + response.getRes());
                    }

                    @Override
                    public void onError(String msg) {
                        System.out.println("onError : response = " + msg);
                    }
                });
    }
}

