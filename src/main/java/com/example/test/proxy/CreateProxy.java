package com.example.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chen.zhangchao
 * @date 2018/7/11 0011
 */
public class CreateProxy implements InvocationHandler{

    private Person person;

    public Object getInstance(Person target){
        this.person = target;
        Class clasz = target.getClass();
        Object obj = Proxy.newProxyInstance(clasz.getClassLoader() , clasz.getInterfaces() , this);
        return obj;
    }




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是链家，找房子");
        method.invoke(person , args);
        System.out.println("找完了");
        return null;
    }
}
