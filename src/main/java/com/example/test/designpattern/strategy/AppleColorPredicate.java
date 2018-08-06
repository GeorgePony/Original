package com.example.test.designpattern.strategy;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class AppleColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
