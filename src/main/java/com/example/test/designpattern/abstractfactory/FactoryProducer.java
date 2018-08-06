package com.example.test.designpattern.abstractfactory;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if("SHAPE".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        }else if("COLOR".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
