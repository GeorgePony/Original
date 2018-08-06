package com.example.test.concurrent.waitNotify;

/**
 * @author chen.zhangchao
 * @date 2018/5/19 0019
 */
public class MyThread1 extends Thread{
    private Object lock;
    public MyThread1(Object lock){
        super();
        this.lock = lock;
    }
    @Override
    public void run(){
        try {
            synchronized (lock){
                System.out.println("开始  wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束  wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
