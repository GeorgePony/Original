package com.example.test.concurrent.pipeStream;

import java.io.PipedOutputStream;

/**
 * @author chen.zhangchao
 * @date 2018/6/5 0005
 */
public class ThreadWrite extends Thread{

    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write , PipedOutputStream out){
        super();
        this.write = write;
        this.out = out;
    }
    @Override
    public void run(){
        write.writeMethod(out);
    }
}
