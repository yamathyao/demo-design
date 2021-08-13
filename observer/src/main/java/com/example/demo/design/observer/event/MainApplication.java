package com.example.demo.design.observer.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yao
 * @date 2021/8/13
 */
public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyPublisher myPublisher = (MyPublisher) context.getBean("myPublisher");
        myPublisher.publishEvent(new MyEvent("1"));
    }
}
