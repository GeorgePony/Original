package com.example.test.designpattern.strategy;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class AppleMain {

    public static void main(String args[]){
        List<Apple> list = Lists.newArrayList(new Apple("green" , 43),
                new Apple("red" , 14));
        List<Apple> result = filterApple(list , new AppleColorPredicate());
        System.out.println(result);
    }

    public static List<Apple> filterApple(List<Apple> inventory , ApplePredicate applePredicate){
        List<Apple> list = new ArrayList<>();
        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                list.add(apple);
            }
        }
        return list;
    }


}
