package com.example.demo.design.state;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yao
 * @date 2019/12/8
 */
public class ActionContext {

    @Getter
    @Setter
    private ActionState actionState;

    public ActionContext() {
        actionState = null;
    }
}
