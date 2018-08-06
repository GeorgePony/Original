package com.example.test.concurrent.threadLocalB;

import java.util.Date;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class ThreadLocalExt extends ThreadLocal{

    @Override
    protected Object initialValue(){
        return new Date().getTime();
    }
}
