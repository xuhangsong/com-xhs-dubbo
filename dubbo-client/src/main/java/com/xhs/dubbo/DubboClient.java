package com.xhs.dubbo;

import com.xhs.dubbo.service.ISayHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xuhan  build  2018/10/8
 */
public class DubboClient {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        context.start();
        ISayHello say = (ISayHello) context.getBean("sayHello");

        for(int i=0;i<10;i++){
            System.out.println(say.sayHello("xhs"));
            Thread.sleep(1000);
        }
    }
}
