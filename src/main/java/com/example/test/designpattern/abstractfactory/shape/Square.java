package com.example.test.designpattern.abstractfactory.shape;

import com.example.test.designpattern.abstractfactory.shape.Shape;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
