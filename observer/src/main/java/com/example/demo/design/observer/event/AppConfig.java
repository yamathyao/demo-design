package com.example.demo.design.observer.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yao
 * @date 2021/8/13
 */
@Configuration
@ComponentScan
public class AppConfig {

    @Bean(name = "myPublisher")
    public MyPublisher myPublisher() {
        return new MyPublisher();
    }
}
