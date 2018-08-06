package com.example.test.concurrent.pipeStream;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class ReadData {

    public void readMethod(PipedInputStream input){
        try {
            System.out.println("read : ");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);
            while(readLength != -1){
                String newData = new String(byteArray , 0  , readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
