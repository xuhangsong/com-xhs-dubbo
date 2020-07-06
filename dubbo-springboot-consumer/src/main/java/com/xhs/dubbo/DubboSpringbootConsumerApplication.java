package com.xhs.dubbo;

import com.xhs.dubbo.service.ISayHello;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@Log4j2
public class DubboSpringbootConsumerApplication {

    @Reference(version = "1.0.0")
    private ISayHello sayHello;

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootConsumerApplication.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            log.error(sayHello.sayHello("666"));
        };
    }
}
