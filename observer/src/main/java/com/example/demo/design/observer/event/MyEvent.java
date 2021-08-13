package com.example.demo.design.observer.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

/**
 * 定义事件
 *
 * @author yao
 * @date 2021/8/13
 */
@Slf4j
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
        log.info("my event");
    }
}
