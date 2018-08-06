package com.example.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
public class streamTest {
    public static void main(String args[]){
        List<Dish> menu = Arrays.asList(
                new Dish("pork" , false , 800),
                new Dish("beef" , false , 700),
                new Dish("chicken" , false , 400),
                new Dish("french fries" , false , 530),
                new Dish("rice" , true , 350),
                new Dish("season fruit" , true , 120),
                new Dish("pizza" , true , 550),
                new Dish("prawns" , false , 300),
                new Dish("salmon" , false , 450)
        );
        List<String> lowCaloricDishesName = menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(lowCaloricDishesName);

        /**
         * mapToInt 将流转换成IntStream 流,避免了自动装箱、自动拆箱的效率损失。
         */
        int count = menu.stream().mapToInt(dish->dish.getCalories()).reduce( 0 , (a , b) -> a+b);

        System.out.println("count : " + count);


        Optional<Integer> optionalInteger = menu.stream().map(dish->dish.getCalories()).reduce(Integer::max);
        System.out.println("max : " +  optionalInteger.get());

    }
}
