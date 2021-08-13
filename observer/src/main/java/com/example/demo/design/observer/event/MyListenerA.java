package com.example.demo.design.observer.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听器 A
 *
 * @author yao
 * @date 2021/8/13
 */
@Slf4j
@Component
public class MyListenerA implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        log.info("ListenerA received");
    }
}
