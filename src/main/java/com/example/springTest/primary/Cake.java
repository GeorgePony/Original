package com.example.springTest.primary;

import org.springframework.stereotype.Component;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Component
public class Cake implements Dessert{
    @Override
    public void amI() {
        System.out.println("I am a cake");
    }
}
