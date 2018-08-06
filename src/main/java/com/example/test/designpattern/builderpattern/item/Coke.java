package com.example.test.designpattern.builderpattern.item;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0F;
    }
}
