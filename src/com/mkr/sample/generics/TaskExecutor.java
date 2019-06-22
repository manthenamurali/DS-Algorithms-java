package com.mkr.sample.generics;

public class TaskExecutor {

    public <Q extends Task.Request, R extends Task.Response> void executeTask
            (Task<Q, R> task, Q request, Task.ResponseCallback<R> callback) {

        task.setRequest(request);
        task.setResponseCallback(callback);

        //start a new thread to execute the task
        new Thread(() ->task.execute() ).start();

    }
}


