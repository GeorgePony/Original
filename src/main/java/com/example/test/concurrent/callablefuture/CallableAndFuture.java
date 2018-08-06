package com.example.test.concurrent.callablefuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class CallableAndFuture {

    public void test(){
        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            };
        };

        FutureTask<Integer> future = new FutureTask<Integer>(callable);
        new Thread(future).start();

        /**
         * 如果休眠，则会有返回值
         * 如果不休眠，没有结果
         */
        //Thread.sleep(5000);
        /**
         * isDone 方法来判断FutureTask所在的线程是否已经执行完毕，并且返回了值
         */
        try {
            if(future.isDone()){
                /**
                 * 如果FutureTask还没有计算出返回值，则get方法会停顿，直到获取返回值
                 */
                System.out.println(future.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
