package com.example.test.designpattern.builderpattern.item;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 35.0F;
    }
}
