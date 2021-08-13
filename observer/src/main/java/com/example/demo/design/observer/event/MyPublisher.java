package com.example.demo.design.observer.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;

/**
 * 事件发布者
 *
 * @author yao
 * @date 2021/8/13
 */
@Slf4j
public class MyPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void publishEvent(ApplicationEvent event) {
        log.info("publish event");
        applicationContext.publishEvent(event);
    }
}
