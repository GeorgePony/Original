
package com.example.test.designpattern.singletonpattern;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){

    }
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
