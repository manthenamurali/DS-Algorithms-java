package com.mkr.sample.generics;

//mimic retrofit to explore generics
public abstract class Task<Q extends Task.Request, R extends Task.Response>  {

    private Q request;
    private ResponseCallback<R> responseCallback;

    public void setRequest(Q request) {
        this.request = request;
    }

    public Q getRequest() {
        return request;
    }

    public void setResponseCallback(ResponseCallback<R> responseCallback) {
        this.responseCallback = responseCallback;
    }

    public ResponseCallback<R> getResponseCallback() {
        return responseCallback;
    }

    public void execute() {
        executeTask(getRequest());
    }

    public abstract void executeTask(Q request);

    interface Request {

    }

    interface Response {

    }

    public interface ResponseCallback<R> {

        void onSuccess(R response);

        void onError(String msg);
    }
}
