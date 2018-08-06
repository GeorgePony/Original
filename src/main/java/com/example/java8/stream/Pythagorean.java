package com.example.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author chen.zhangchao
 * @date 2018/7/27 0027
 */
public class Pythagorean {
    /**
     * 算出勾股数
     * @param args
     */
    public static void main(String[] args){
        Stream<int[]> phthagoreanTriples =
                IntStream.rangeClosed(1 , 100).boxed()
                .flatMap(a -> IntStream.rangeClosed( a , 100)
                .filter(b -> Math.sqrt(a*a + b*b)%1 == 0)
                .mapToObj(b-> new int[]{a ,b , (int)Math.sqrt(a * a + b*b)}));

        phthagoreanTriples.forEach( t -> System.out.println(t[0] + "," + t[1] + "," + t[2]));


    }

}
