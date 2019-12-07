package com.example.demo.design.mediator.chat;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yao
 * @date 2019/12/7
 */
@Slf4j
public class ChatRoom {

    public static void showMessage(User user, String message) {
        log.info("{} [ {} ] : {}", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), user.getName(), message);
    }
}
