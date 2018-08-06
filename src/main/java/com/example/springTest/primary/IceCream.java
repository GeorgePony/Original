package com.example.springTest.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Component
@Primary//如果不加Primary ， 那么PrimaryTest就会有多个Bean适配，报错
public class IceCream implements Dessert{
    @Override
    public void amI() {
        System.out.println("I am a IceCream");
    }
}
