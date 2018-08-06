package com.example.test.concurrent.joinTest;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class Test {


    public static void main(String[] args){
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.join();
            System.out.println("After");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
