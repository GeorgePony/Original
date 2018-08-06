package com.example.springTest.condition.conditionalclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author chen.zhangchao
 * @date 2018/7/25 0025
 *
 * Configuration 用户注解类，表明这个类是beans 定义的源
 */
@Configuration
public class CmdServiceCondtionConfig {


    /**
     * 当WindowsCondtion 的 matches 方法符合条件的情况下 ， WindowCmdService 会被注入
     * @return
     */

    /**
     * @Bean 被@Bean注解的方法，会实例化、配置并且初始化一个新的对象，这个对象会被Spring IOC 容器管理
     *    @Bean 注解只能用于方法上
     * @return
     */
    @Bean
    @Conditional(WindowsCondtion.class)
    public CmdService windowCmdService(){
        return new WindowCmdService();
    }

    @Bean
    @Conditional(LinuxCondtion.class)
    public CmdService linuxCmdService(){
        return new LinuxCmdService();
    }
}
