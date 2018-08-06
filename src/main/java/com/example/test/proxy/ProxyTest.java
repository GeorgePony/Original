package com.example.test.proxy;

import org.junit.Test;

/**
 * @author chen.zhangchao
 * @date 2018/7/11 0011
 */
public class ProxyTest {


    @Test
    public void test(){
        Person person = (Person) new CreateProxy().getInstance(new Master());
        person.searchHouse();
    }
}
