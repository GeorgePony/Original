package com.example.springTest.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
public class OrderTest {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/order/beans.xml");
        Results results = (Results)ctx.getBean("results");
        System.out.println(results.toString());
    }


}
