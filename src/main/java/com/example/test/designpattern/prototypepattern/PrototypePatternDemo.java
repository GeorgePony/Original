package com.example.test.designpattern.prototypepattern;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class PrototypePatternDemo {
    public static void main(String args[]){
        ShapeCache.loadShape();
        Shape clonedShape = (Shape)ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
    }
}
