package com.xhs.dubbo;


import com.xhs.dubbo.service.ISayHello;

/**
 * @author xuhan  build  2018/10/10
 */
public class MorkSayHelloMock implements ISayHello {
    public MorkSayHelloMock() {
    }

    public String sayHello(String s) {
        return "我是降级得 Hello "+s;
    }
}
