package com.example.springTest.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Component
@Order(5)
public class RankOne implements Ranks{

    public String toString(){
        return "rankOne";
    }

}
