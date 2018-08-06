package com.example.test.concurrent.waitNotify.ProCon;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class P {

    private String lock;
    public P(String lock){
        super();
        this.lock = lock;
    }
    public void setValue(){
        try {
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_"
                        + System.nanoTime();
                System.out.println("set 的值是 :  " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
