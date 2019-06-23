package com.mkr.sample;

import com.mkr.sample.ds.MyLinkedList;
import com.mkr.sample.ds.MyQueue;
import com.mkr.sample.generics.DownloadTask;
import com.mkr.sample.generics.Task;
import com.mkr.sample.generics.TaskExecutor;

import java.util.LinkedList;

public class SampleJava {

    public static void main(String[] args) {
        System.out.println("Hello, Murali!!!");

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.insert("Hello");
        linkedList.insert("Murali");
        linkedList.insert("How");
        linkedList.insert("are");
        linkedList.insert("you?");

        //linkedList.insert(4, "middle");

        linkedList.remove(2);

        linkedList.print();


        //genericsample();
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

