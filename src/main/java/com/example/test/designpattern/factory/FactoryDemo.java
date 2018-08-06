package com.example.test.designpattern.factory;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class FactoryDemo {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rect = shapeFactory.getShape("RECTANGLE");
        rect.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
