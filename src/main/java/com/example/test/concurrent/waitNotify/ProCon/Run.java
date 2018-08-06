package com.example.test.concurrent.waitNotify.ProCon;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class Run {
    public static void main(String[] args){
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
