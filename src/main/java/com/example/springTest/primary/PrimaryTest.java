package com.example.springTest.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
public class PrimaryTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DessertConfig.class);
        Dessert des = ctx.getBean(Dessert.class);
        des.amI();
    }
}
