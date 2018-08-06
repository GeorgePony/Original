package com.example.test.concurrent.pipeStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class Run {

    public static void main(String[] args){
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

            outputStream.connect(inputStream);
            ThreadRead threadRead = new ThreadRead(readData , inputStream);
            threadRead.start();
            java.lang.Thread.sleep(2000);
            ThreadWrite threadWrite = new ThreadWrite(writeData , outputStream);
            threadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        }catch(InterruptedException ee){
            ee.printStackTrace();
        }
    }


}
