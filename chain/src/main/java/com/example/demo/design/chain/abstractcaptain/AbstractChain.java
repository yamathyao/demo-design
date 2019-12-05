package com.example.demo.design.chain.abstractcaptain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
@Slf4j
public abstract class AbstractArmy {

    private AbstractArmy next;

    public AbstractArmy(AbstractArmy next) {
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
