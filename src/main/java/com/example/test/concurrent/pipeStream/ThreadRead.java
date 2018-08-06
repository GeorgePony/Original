package com.example.test.concurrent.pipeStream;

import java.io.PipedInputStream;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class ThreadRead extends Thread{

    private ReadData read;
    private PipedInputStream input;
    public ThreadRead(ReadData read , PipedInputStream input){
        super();
        this.read = read;
        this.input = input;
    }
    @Override
    public void run(){
        read.readMethod(input);
    }
}
