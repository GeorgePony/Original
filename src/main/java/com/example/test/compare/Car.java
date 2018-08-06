
package com.example.test.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class Car implements Comparable<Car>{

    private int cost;

    public Car(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * compareTo  比较规则：0或者负数，则小于 o ，整数，则视为大于o
     * @param o
     * @return
     */
    public int compareTo(Car o) {
        return this.cost - o.cost;
    }


    public static void main(String args[]){

        Car car1 = new Car(10);
        Car car2 = new Car(20);
        List<Car> list = Arrays.asList(car1 , car2);
        Collections.sort(list);

        for(int i = 0 ; i < list.size() ; i ++){
            Car car = list.get(i);
            System.out.println(car.getCost());
        }
    }

}
