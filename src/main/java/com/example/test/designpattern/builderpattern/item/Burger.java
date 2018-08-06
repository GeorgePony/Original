package com.example.test.designpattern.builderpattern.item;

import com.example.test.designpattern.builderpattern.Item;
import com.example.test.designpattern.builderpattern.Packing;
import com.example.test.designpattern.builderpattern.packing.Wrapper;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
