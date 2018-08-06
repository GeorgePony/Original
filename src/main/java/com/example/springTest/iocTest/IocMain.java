package com.example.springTest.iocTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author chen.zhangchao
 * @date 2018/6/17 0017
 */
@SuppressWarnings("deprecation")
public class IocMain {

    public static void main(String[] args){
        ClassPathResource resource = new ClassPathResource("spring/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        User user = beanFactory.getBean("user1" , User.class);
        System.out.println(user.getName() + "  " + user.getAge());
    }
}
