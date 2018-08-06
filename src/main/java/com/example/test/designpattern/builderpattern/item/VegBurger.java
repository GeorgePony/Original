package com.example.test.designpattern.builderpattern.item;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0F;
    }
}
