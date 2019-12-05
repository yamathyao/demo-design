package com.example.demo.design.chain.abstractcaptain;

/**
 *
 * @author GEEX177
 * @date 2019/12/5
 */
public class MainApplication {

    public static void main(String[] args) {
        Marshal marshal = new Marshal();
        marshal.setCommand(new Command(Command.ArmyLevel.GENERAL, String.format("tell %s attack", Command.ArmyLevel.GENERAL.name())));
        marshal.setCommand(new Command(Command.ArmyLevel.COLONEL, String.format("tell %s attack", Command.ArmyLevel.COLONEL.name())));
        marshal.setCommand(new Command(Command.ArmyLevel.ARMY, String.format("tell %s attack", Command.ArmyLevel.ARMY.name())));
    }
}
