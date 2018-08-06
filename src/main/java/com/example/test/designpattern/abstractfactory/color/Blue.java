package com.example.test.designpattern.abstractfactory.color;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() Method");
    }
}
