package com.example.test.designpattern.singletonpattern;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class SingletonDemo {
    public static void main(String args[]){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
