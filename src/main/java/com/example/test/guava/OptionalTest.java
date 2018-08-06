package com.example.test.guava;

import com.google.common.base.Optional;
import org.junit.Test;

/**
 * @author chen.zhangchao
 * @date 2018/6/19 0019
 */
public class OptionalTest {
    /**
     * 提供多种方法去操作可能为null的对象
     */
    @Test
    public void test(){

        Integer value1 = null;
        Integer value2 = new Integer(10);
        Optional<Integer> a = Optional.fromNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a , b));
    }


    public Integer sum(Optional<Integer> a ,Optional<Integer> b){
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        Integer value1 = a.or(new Integer(0));
        Integer value2 = b.get();
        return value1 + value2;
    }

}
