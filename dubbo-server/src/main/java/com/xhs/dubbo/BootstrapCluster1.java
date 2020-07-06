package com.xhs.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xuhan  build  2018/10/8
 */
public class BootstrapCluster1 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-cluster1.xml");
        context.start();
        System.in.read();
    }
}
