package com.mkr.sample;

import com.mkr.sample.ds.MyLinkedList;
import com.mkr.sample.ds.MyQueue;
import com.mkr.sample.generics.DownloadTask;
import com.mkr.sample.generics.Task;
import com.mkr.sample.generics.TaskExecutor;
import com.mkr.sample.searching.BinarySearch;
import com.mkr.sample.searching.LinearSearch;

import java.util.LinkedList;
import java.util.Random;

public class SampleJava {

    public static void main(String[] args) {
        System.out.println("Hello, Murali!!!");

       // Examples.getTagContent("<>hello</>");

        int[] arr = new int[10];

        /*for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }*/

        arr = new int[] {3, 7, 14, 20, 29, 30, 45, 63, 78, 85, 99};

        System.out.println(BinarySearch.findIndex(arr, 30));
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

