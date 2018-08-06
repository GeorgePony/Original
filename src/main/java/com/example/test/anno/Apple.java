package com.example.test.anno;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor= FruitColor.Color.PURPLE)
    private String appleColor;

}
