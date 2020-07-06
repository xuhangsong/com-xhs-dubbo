package com.xhs.dubbo;


import com.xhs.dubbo.service.ISayHello;

/**
 * @author xuhan  build  2018/10/8
 */
public class SayHelloImpl2 implements ISayHello {
    @Override
    public String sayHello(String msg) {
        return "Hello "+msg + " 2";
    }
}
