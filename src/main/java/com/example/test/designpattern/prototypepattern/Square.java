package com.example.test.designpattern.prototypepattern;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Square extends Shape{
    public Square(){
        type="Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
