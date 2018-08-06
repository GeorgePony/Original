package com.example.java8.function.function;

import java.util.function.Function;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
public class FunctionTest {

    /**
     * Function<T , R>  T代表入参，R代表出参结果。
     * f.andThen(g) 为g(f(x))
       f.compose(g) 为f(f(x))
     * @param args
     */
    public static void main(String[] args){

        Function<Integer , Integer> f = x ->x + 1;
        Function<Integer , Integer> g = x -> x * 2;
        Function<Integer , Integer> h = f.andThen(g);
        int result = h.apply(3);

        Function<Integer , Integer> i = f.compose(g);
        int result2 = i.apply(3);

        System.out.println("result : " + result );
        System.out.println("result2 : " + result2 );




    }




}
