package com.example.test.designpattern.prototypepattern;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Circle extends Shape{
    public Circle(){
        type="Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
