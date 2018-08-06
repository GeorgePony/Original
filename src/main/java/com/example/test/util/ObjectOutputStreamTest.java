package com.example.test.util;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author chen.zhangchao
 * @date 2018/6/9 0009
 */
public class ObjectOutputStreamTest {

    @Test
    public void test() throws Exception{
        ObjectInputStream in  = new ObjectInputStream(new FileInputStream("calendar out"));
        Calendar calendar =  (GregorianCalendar)in.readObject();
        System.out.println("Time : " + calendar.getTime());
        in.close();
    }


    @Test
    public void testOut() throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("calendar out"));
        Calendar calendar = Calendar.getInstance();
        calendar.set(1998 , 5,9,2,3,4);
        out.writeObject(calendar);
        out.close();
    }


}
