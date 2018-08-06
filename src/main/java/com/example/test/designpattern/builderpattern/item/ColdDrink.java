package com.example.test.designpattern.builderpattern.item;

import com.example.test.designpattern.builderpattern.Item;
import com.example.test.designpattern.builderpattern.Packing;
import com.example.test.designpattern.builderpattern.packing.Bottle;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }
    @Override
    public abstract float price();
}
