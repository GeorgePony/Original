package com.example.test.designpattern.builderpattern.packing;

import com.example.test.designpattern.builderpattern.Packing;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}
