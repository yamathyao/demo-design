package com.example.demo.design.state;

import com.example.demo.design.state.impl.StartState;
import com.example.demo.design.state.impl.StopState;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/8
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        ActionContext context = new ActionContext();

        ActionState startState = new StartState();
        startState.doAction(context);

        log.info(context.getActionState().toString());

        ActionState stopState = new StopState();
        stopState.doAction(context);

        log.info(context.getActionState().toString());
    }
}
