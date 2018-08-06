package com.example.test.concurrent.joinTest;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class MyThread extends Thread{
    public void run(){
        try {
            int secondValue = (int)(Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
