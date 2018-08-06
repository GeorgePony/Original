package com.example.java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author chen.zhangchao
 * @date 2018/7/27 0027
 */
public class newStream {

    public static void main(String[] args){
        Stream<String> stream = Stream.of("Java 8" , "Lambdas" , "In " , "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);

        int[] numbers = {2 , 3, 4, 5,6 ,12};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

    }


}
