package com.example.springTest.condition.conditionalclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author chen.zhangchao
 * @date 2018/7/25 0025
 */
@SpringBootApplication
public class testCondition {


    public static void main(String args[]){

        ApplicationContext ctx = (ApplicationContext)SpringApplication.run(testCondition.class , args);
        CmdService cmdService = ctx.getBean(CmdService.class);
        cmdService.print();
    }
}
