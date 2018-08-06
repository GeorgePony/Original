package com.example.test.designpattern.abstractfactory.color;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() Method");
    }
}
