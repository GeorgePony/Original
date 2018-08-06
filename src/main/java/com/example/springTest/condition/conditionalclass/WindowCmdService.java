package com.example.springTest.condition.conditionalclass;

/**
 * @author chen.zhangchao
 * @date 2018/7/25 0025
 *
 * 该类并没有使用@Service !!!!!!
 */
public class WindowCmdService implements CmdService{
    @Override
    public void print() {
        System.out.println("Window Cmd ......");
    }
}
