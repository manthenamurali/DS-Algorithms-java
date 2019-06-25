package com.mkr.sample;

import com.mkr.sample.ds.MyLinkedList;
import com.mkr.sample.ds.MyQueue;
import com.mkr.sample.generics.DownloadTask;
import com.mkr.sample.generics.Task;
import com.mkr.sample.generics.TaskExecutor;
import com.mkr.sample.searching.LinearSearch;

import java.util.LinkedList;
import java.util.Random;

public class SampleJava {

    public static void main(String[] args) {
        System.out.println("Hello, Murali!!!");

       // Examples.getTagContent("<>hello</>");

        int[] arr = new int[100];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(LinearSearch.getIndexForItem(arr, 25));
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

