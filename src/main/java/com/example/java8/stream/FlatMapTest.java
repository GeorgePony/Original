package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chen.zhangchao
 * @date 2018/7/27 0027
 */
public class FlatMapTest {

    public static void main(String[] args){
        List<Integer> numbers1 = Arrays.asList(1 ,2 ,3);
        List<Integer> numbers2 = Arrays.asList(3 ,4);
        List<int[]> pairs = numbers1.stream().flatMap(
                i->numbers2.stream().map(j->new int[]{i , j })).
                collect(Collectors.toList());

        System.out.println(pairs);

    }

}
