package com.example.test.designpattern.factory;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
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
