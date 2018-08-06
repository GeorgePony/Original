package com.example.test.concurrent.waitNotify.ProCon;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class ThreadP extends Thread{
    private P p;
    public ThreadP(P p){
        super();
        this.p = p;
    }
    @Override
    public void run(){
        while(true){
            p.setValue();
        }
    }
}
