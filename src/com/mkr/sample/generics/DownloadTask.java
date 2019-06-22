package com.mkr.sample.generics;

/**
 * Notes
 * 1. Task<DownloadTask.Request, DownloadTask.Response> is very important ( instead of just Task)
 * because if we don't pass the types, at compile time, it will use the default types defined in Task ie,,
 * Q extends Task.Request, R extends Task.Response. So, the argument in  executeTask will be Task.Request
 * and we won't be able to use the DownloadTask request.
 *
 * Hence if we define <DownloadTask.Request, DownloadTask.Response> then compiler will infer Q as DownloadTask.Request and
 * R as DownloadTask.Response.
 *
 * So, all ways remember that infering/assigning the generic types is very important.
 *
 * Also note generics can be define at class level (like in task) or method level like
 * public <Q extends Task.Request, R extends Task.Response> void executeTask
 *             (Task<Q, R> task, Q request, Task.ResponseCallback callback)
 *
 */
public class DownloadTask extends Task<DownloadTask.Request, DownloadTask.Response> {

    @Override
    public void executeTask(Request request) {

        //based on the request execute the task
        String url = request.getUrl();
        if(url != null && url.length() > 0) {
            getResponseCallback().onSuccess(new Response("Downloaded file!!!"));
        } else {
            getResponseCallback().onError("Invalid URL!!!");
        }
    }

    public static class Request implements Task.Request {

        private String url;
        private String fileNameToDownload;

        public Request(String url, String fileNameToDownload) {
            this.url = url;
            this.fileNameToDownload = fileNameToDownload;
        }

        public String getUrl() {
            return url;
        }

        public String getFileNameToDownload() {
            return fileNameToDownload;
        }
    }

    public static class Response implements Task.Response {

        String res;

        Response(String res) {
            this.res = res;
        }

        public String getRes() {
            return res;
        }
    }
}
