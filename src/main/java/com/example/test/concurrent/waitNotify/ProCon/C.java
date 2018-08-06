package com.example.test.concurrent.waitNotify.ProCon;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class C {

    private String lock;
    public C(String lock){
        super();
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值是 " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
