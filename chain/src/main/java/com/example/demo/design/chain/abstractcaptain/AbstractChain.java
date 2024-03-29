package com.example.demo.design.chain.abstractcaptain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/5
 */
@Slf4j
public abstract class AbstractChain {

    private AbstractChain next;

    public AbstractChain(AbstractChain next) {
        this.next = next;
    }

    public void setCommand(Command command) {
        if (null != next) {
            next.setCommand(command);
        }
    }

    protected void printCommand(Command command) {
        log.info("{} has received, command is {}", this, command.toString());
    }
}
