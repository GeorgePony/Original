package com.example.test.designpattern.abstractfactory.shape;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
