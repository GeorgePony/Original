package com.example.springTest.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author chen.zhangchao
 * @date 2018/7/25 0025
 */
public class AopMain {

    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/aop/beans.xml");
        UserDao userDao = (UserDao)ac.getBean("userDao");
        userDao.save("123");
    }
    /**
     * 开始事务
     .. 核心业务 ..
     关闭事务
     afterReturn
     */

    /**
     * 环绕执行
     关闭事务
     afterReturn
     */





}
