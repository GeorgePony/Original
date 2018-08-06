package com.example.springTest.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chen.zhangchao
 * @date 2018/7/26 0026
 */
@Component
public class Results {

    @Autowired
    private List<Ranks> ranks;

    public String toString(){
        return ranks.toString();
    }


}
