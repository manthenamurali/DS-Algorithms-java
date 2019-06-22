package com.mkr.sample;

import com.mkr.sample.ds.MyQueue;
import com.mkr.sample.generics.DownloadTask;
import com.mkr.sample.generics.Task;
import com.mkr.sample.generics.TaskExecutor;

public class SampleJava {

    public static void main(String[] args) {
        System.out.println("Hello, Murali!!!");

        /*MyQueue q = new MyQueue();

        for(int i=1; i<= 15; i++) {
            q.push(i + 200);
        }

        for(int i=1; i<=20 ; i++) {
            System.out.println(q.pop());
        }*/

        genericSample();
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

