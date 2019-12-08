package com.example.demo.design.state.impl;

import com.example.demo.design.state.ActionContext;
import com.example.demo.design.state.ActionState;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/8
 */
@Slf4j
public class StopState implements ActionState {


    @Override
    public void doAction(ActionContext actionContext) {
        log.info("Player is in stop state.");
        actionContext.setActionState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
