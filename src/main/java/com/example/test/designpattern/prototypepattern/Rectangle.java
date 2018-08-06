package com.example.test.designpattern.prototypepattern;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
