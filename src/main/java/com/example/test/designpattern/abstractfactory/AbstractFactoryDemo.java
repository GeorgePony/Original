package com.example.test.designpattern.abstractfactory;


import com.example.test.designpattern.abstractfactory.color.Color;
import com.example.test.designpattern.abstractfactory.shape.Shape;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class AbstractFactoryDemo {
    public static void main(String args[]){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("RED");
        red.fill();
    }
}
