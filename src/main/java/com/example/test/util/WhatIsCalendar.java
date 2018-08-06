package com.example.test.util;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author chen.zhangchao
 * @date 2018/6/9 0009
 */
public class WhatIsCalendar {

    public static void main(String args[]) throws Exception{
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        calendar.set(2000 , 7 , 1, 0 , 0 , 0 );

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("calendar out"));
        out.writeObject(calendar);
        out.close();

        if(calendar instanceof GregorianCalendar){
            System.out.println("It is an instance of GregorianCalendar");
        }
    }


}
