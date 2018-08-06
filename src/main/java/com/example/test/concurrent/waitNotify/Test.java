package com.example.test.concurrent.waitNotify;
/**
 * 测试多线程的等待通知机制
 * @author chen.zhangchao
 * @date 2018/5/19 0019
 */
public class Test {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @org.junit.Test
    public void Test(){
        try {
            Object lock = new Object();
            MyThreadAuto t1 = new MyThreadAuto(lock);
            t1.start();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
