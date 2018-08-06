package com.example.test.concurrent.waitNotify;

/**
 * @author chen.zhangchao
 * @date 2018/5/19 0019
 */
public class MyThreadAuto extends Thread{

    private Object lock;
    public MyThreadAuto(Object lock){
        super();
        this.lock = lock;
    }
    @Override
    public void run(){
        try {
            synchronized (lock){
                System.out.println("开始  wait time=" + System.currentTimeMillis());
                lock.wait(3000);
                System.out.println("结束  wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
