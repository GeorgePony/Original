package com.example.test.concurrent.threadLocalB;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class Run {

    public static void main(String args[]){
        try {
            for(int i = 0 ; i < 10 ; i ++){
                System.out.println(" 在Main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(3000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
