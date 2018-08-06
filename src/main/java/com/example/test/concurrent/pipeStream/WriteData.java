package com.example.test.concurrent.pipeStream;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("write : ");
            for(int i = 0 ; i < 300 ; i ++){
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
