package com.example.test.designpattern.abstractfactory;

import com.example.test.designpattern.abstractfactory.color.Blue;
import com.example.test.designpattern.abstractfactory.color.Color;
import com.example.test.designpattern.abstractfactory.color.Green;
import com.example.test.designpattern.abstractfactory.color.Red;
import com.example.test.designpattern.abstractfactory.shape.Shape;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        if("RED".equalsIgnoreCase(colorType)){
            return new Red();
        }else if("GREEN".equalsIgnoreCase(colorType)){
            return new Green();
        }else if("BLUE".equalsIgnoreCase(colorType)){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
