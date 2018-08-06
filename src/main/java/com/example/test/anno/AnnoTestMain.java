package com.example.test.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author chen.zhangchao
 * @date 2018/6/17 0017
 */
public class AnnoTestMain {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> classTest = Class.forName("com.example.test.anno.Apple");
        Field[] fields = classTest.getDeclaredFields();
        for(Field f : fields){
            Annotation[] ann = f.getAnnotations();
            for(Annotation a : ann){
                System.out.println(a.getClass());
            }
        }
    }
}
