package com.example.demo.design.chain.abstractcaptain;

/**
 * @author yao
 * @date 2019/12/5
 */
public class Marshal {

    private AbstractChain chain;

    public Marshal() {
        createCommand();
    }

    private void createCommand() {
        chain = new General(new Colonel(new Army(null)));
    }

    public void setCommand(Command command) {
        chain.setCommand(command);
    }
}
