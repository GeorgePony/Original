package com.example.java8.stream;

/**
 * @author chen.zhangchao
 * @date 2018/7/18 0018
 */
public class Dish {
    private int calories;
    private boolean vegetarian;
    private String name;
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dish( String name,boolean vegetarian, int calories) {
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.name = name;
    }
}
