package com.example.test.designpattern.builderpattern.item;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5F;
    }
}
