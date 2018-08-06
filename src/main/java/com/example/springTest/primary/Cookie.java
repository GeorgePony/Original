package com.example.springTest.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Component
public class Cookie implements Dessert{

    @Override
    public void amI() {
        System.out.println("I am a cookie");
    }
}
