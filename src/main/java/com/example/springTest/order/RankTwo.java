package com.example.springTest.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Component
@Order(4)
public class RankTwo implements Ranks{

    public String toString(){
        return "rankTwo";
    }
}
