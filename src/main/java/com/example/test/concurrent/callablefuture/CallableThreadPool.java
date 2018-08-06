package com.example.test.concurrent.callablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class CallableThreadPool {


    public static class Task implements Callable<String>{

        public String call() throws Exception {
            System.out.println("Execute");
            return "complete" + Thread.currentThread();
        }

    }


    public void testThreadPool()throws ExecutionException, InterruptedException {
        List<Future<String>> futureList = new ArrayList<Future<String>>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 10 ; i ++){
            futureList.add(executorService.submit(new Task()));
        }

        for(Future<String> future : futureList){
            System.out.println(future.get());
        }
        System.out.println("Main Complete");
        if(!executorService.isShutdown()){
            executorService.shutdown();
        }
    }

}
