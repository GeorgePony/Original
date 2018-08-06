package com.example.test.designpattern.abstractfactory;

import com.example.test.designpattern.abstractfactory.color.Color;
import com.example.test.designpattern.abstractfactory.shape.Circle;
import com.example.test.designpattern.abstractfactory.shape.Rectangle;
import com.example.test.designpattern.abstractfactory.shape.Shape;
import com.example.test.designpattern.abstractfactory.shape.Square;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
