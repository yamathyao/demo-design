package com.example.demo.design.chain.abstractcaptain;

/**
 * @author yao
 * @date 2019/12/5
 */
public class Army extends AbstractChain {
    public Army(AbstractChain next) {
        super(next);
    }

    @Override
    public void setCommand(Command command) {
        if (Command.ArmyLevel.ARMY == command.getLevel()) {
            printCommand(command);
        } else {
            super.setCommand(command);
        }
    }

    @Override
    public String toString() {
        return "Army";
    }
}
