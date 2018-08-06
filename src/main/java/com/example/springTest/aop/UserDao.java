package com.example.springTest.aop;

import org.springframework.stereotype.Component;

/**
 * @author chen.zhangchao
 * @date 2018/7/25 0025
 */
@Component
public class UserDao {


    public void save(String str){
        System.out.println(".. 核心业务 .." + str);
    }
}
