package com.example.java8.function.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author chen.zhangchao
 * @date 2018/7/23 0023
 */
public class PredicateTest {


    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1  , 2 ,3 ,4,5,6,7,8,9,10);
        PredicateTest pt = new PredicateTest();
        Predicate<Integer> p = integer -> integer > 5;
        List<Integer> result = pt.conditionFilter(list , p.and(integer -> integer < 7));
        result.forEach(System.out::println);
        System.out.println("------");
    }


    public List<Integer> conditionFilter(List<Integer> list , Predicate<Integer> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

}
