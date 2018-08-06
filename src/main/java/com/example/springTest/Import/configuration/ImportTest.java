package com.example.springTest.Import.configuration;

import com.example.springTest.Import.configuration.ImportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
public class ImportTest {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.springTest.Import.configuration");
        ImportService ds = context.getBean(ImportService.class);
        ds.doSomeThing();
    }


}
