package com.example.test.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @interface 自定义注解，自动继承了java.lang.annotation.Annotation 接口
 */

/**
 * Target  指示注释类型所适用的程序元素的种类。如果注释类型声明中不存在 Target 元注释，则声明的类型可以用在任一程序元素上。如果存在这样的元注释，则编译器强制实施指定的使用限制
 */
@Target(ElementType.FIELD)
/**
 *  Retention  这种类型的注解会被保留到哪个阶段
 *     RetentionPolicy.SOURCE    源代码级别保留,编译时就会被忽略
 *     RetentionPolicy.CLASS     编译时被保留,在class文件中存在,但JVM将会忽略
 *     RetentionPolicy.RUNTIME   被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用.
 */
@Retention(RetentionPolicy.RUNTIME)
/**
 * 这个注解应该被 javadoc工具记录. 默认情况下,javadoc是不包括注解的. 但如果声明注解时指定了 @Documented,则它会被 javadoc 之类的工具处理
 */
@Documented
public @interface FruitColor {


    public enum Color{BLUE , RED , PURPLE};


    Color fruitColor() default Color.BLUE;

}
