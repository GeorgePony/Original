package com.example.springTest.Import.ImportBeanDefinitionRegistrar;

import com.example.springTest.Import.importSelector.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Configuration
@Import({MyImportBeanDefinitionRegistrar.class})
public class MyConfig {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanNames = ctx.getBeanDefinitionNames();
        for(int i = 0 ; i < beanNames.length ; i ++){
            System.out.println("bean名称为 === " + beanNames[i]);
        }
    }
}
