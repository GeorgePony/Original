package com.example.test.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author chen.zhangchao
 * @date 2018/6/6 0006
 */
public class IteratorTest {


    @Test
    public void test(){
        List<String> list = Arrays.asList("张三" , "张三1" ,"张三2" ,"张三3");

        List<String> linkList = Arrays.asList("link1" , "link2" , "link3" ,"link4");

        Set<String> set = new HashSet<>();
        set.add("set1");
        set.add("set2");
        set.add("set3");
        set.add("set4");

        Iterator<String> listStr = list.iterator();

        while(listStr.hasNext()){
            System.out.println(listStr.next());
        }

        Iterator<String> linkStr = linkList.iterator();
        while(linkStr.hasNext()){
            System.out.println(linkStr.next());
        }

        Iterator<String> setStr = set.iterator();
        while(setStr.hasNext()){
            System.out.println(setStr.next());
        }


    }

}
