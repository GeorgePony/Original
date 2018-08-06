package com.example.springTest.primary;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Configuration
@ComponentScan(basePackageClasses = Dessert.class)
public class DessertConfig {
}
