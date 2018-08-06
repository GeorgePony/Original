package com.czc.concurrent.threadPool;
import org.junit.Test;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author chen.zhangchao
 * @date 2018/5/20 0020
 */
public class TheadPoolTest {

    /**
     * newCachedThreadPool会根据任务来临的需要决定是否创建新的线程，也就是如果来了新的任务又没有空闲的线程，就回创建一个新的线程。
     * @throws Exception
     * Creates a thread pool that creates new threads as needed, but
     * will reuse previously constructed threads when they are
     * available.  These pools will typically improve the performance
     * of programs that execute many short-lived asynchronous tasks.
     */
    @Test
    public  void testNewCachedThreadPool() throws Exception{
        ExecutorService service =  Executors.newCachedThreadPool();
        for(int i = 0 ; i < 10 ; i ++){
            final int count = i ;
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程:" + Thread.currentThread() + "负责了" + count );
                }
            });
            /**
             * sleep(1) 的情况下，只启动了两个线程。
             * 不sleep的情况下，启动了十个线程
             */
            Thread.sleep(1);
        }
    }

    @Test
    public void testNewFixedThreadPool() throws Exception{
        ExecutorService sevice  = Executors.newFixedThreadPool(4);
        for(int i = 0 ; i <= 10 ; i ++){
            final int count = i;
            sevice.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程:" + Thread.currentThread() + "负责了" + count );
                }
            });
            /**
             * sleep 的情况下，有明显的停滞效果
             */
            Thread.sleep(1000);
        }
    }

    /**
     * 测试定时任务线程池
     */
    @Test
    public void testScheduledExecutor(){
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Date now = new Date();
                System.out.println("线程" + Thread.currentThread() + "报时：" + now);
            }
        } , 0 , 100 , TimeUnit.MILLISECONDS);

        while(true){

        }
    }

    /**
     * 创建一个带有并行级别的线程池，并行级别决定了同一时间最多有多少个线程在执行，如果不指定并行级别，则默认为系统CPU的个数
     */
    @Test
    public void testWorkingStealPool(){
        /**
         * 可以指定参数，
         */
        ExecutorService service = Executors.newWorkStealingPool();
        for(int i = 0 ; i < 10 ; i ++){
            final int count = i;
            service.submit(new Runnable() {
                @Override
                public void run() {
                    Date now = new Date();
                    System.out.println("线程" + Thread.currentThread() + "完成任务：" + count +
                            "  现在时间为：" + now);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        while(true){

        }
    }


}
