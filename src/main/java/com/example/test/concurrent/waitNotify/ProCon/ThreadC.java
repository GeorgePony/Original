package com.example.test.concurrent.waitNotify.ProCon;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class ThreadC  extends Thread{

    private C c;
    public ThreadC(C c){
        super();
        this.c = c;
    }
    @Override
    public void run(){
        while(true){
            c.getValue();
        }
    }
}
