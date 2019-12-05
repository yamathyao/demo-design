package com.example.demo.design.chain.abstractcaptain;

/**
 *
 * @author GEEX177
 * @date 2019/12/5
 */
public class General extends AbstractChain {
    public General(AbstractChain next) {
        super(next);
    }

    @Override
    public void setCommand(Command command) {
        if (Command.ArmyLevel.GENERAL == command.getLevel()) {
            printCommand(command);
        } else {
            super.setCommand(command);
        }
    }


    @Override
    public String toString() {
        return "General";
    }
}
