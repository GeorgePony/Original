package com.example.test.designpattern.prototypepattern;

import java.util.Hashtable;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class ShapeCache {

    private static Hashtable<String , Shape> shapeMap = new Hashtable<String , Shape>();
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }
    public static void loadShape(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId() , circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId() , rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId() , square);
    }
}
