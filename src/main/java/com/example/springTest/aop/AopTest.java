package com.example.springTest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author chen.zhangchao
 * @date 2018/7/25 0025
 */
@Aspect
@Component
public class AopTest {

    @Pointcut("execution(* com.example.springTest.aop.UserDao.save(..))")
    public void pointCut(){

    }


    @Before("pointCut()")
    public void begin(){
        System.out.println("开始事务");
    }

    @After("pointCut()")
    public void close(){
        System.out.println("关闭事务");
    }

    /**
     * Around 需要在线程安全的情况下才可以使用，如果使用普通的Before 和 AfterReturning 可以解决的问题，尽量别使用Around
     *
     * Around不光可以增强处理，还可以组织目标方法的执行
     * 可以改变目标方法的参数值，也可以改变目标方法的返回值
     *
     * Join point return value will be lost less... (Ctrl+F1)
     When using "around" advice, it's a good idea to remember two things: calling "org.aspectj.lang.ProceedingJoinPoint#proceed" - otherwise call won't reach target returning the result value (typed java.lang.Object) of that call - otherwise return value will never reach original caller
     However, the following two conditions almost always indicate a coding error:

     The signature for the "around" method does not have ProceedingJoinPoint as first argument: in such cases it's impossible for the call to reach the target
     The signature for the "around" method does not have Object as return type: in such cases return value of target method is always lost.
     */
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point)throws Throwable{
        Object obj = point.proceed( new String[]{"Hello AOP"});
        System.out.println("环绕执行");
        return obj + "新增的内容";
    }

    @AfterReturning("pointCut()")
    public void afterReturn(){
        System.out.println("afterReturn");
    }



}
