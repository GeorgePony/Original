package com.example.test.designpattern.abstractfactory;

import com.example.test.designpattern.abstractfactory.color.Color;
import com.example.test.designpattern.abstractfactory.shape.Shape;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
