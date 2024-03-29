package com.example.demo.design.command.font;

/**
 * @author yao
 * @date 2019/12/5
 */
public abstract class AbstractCommand {

    public abstract void execute();

    public abstract void redo();

    public abstract void undo();

    @Override
    public abstract String toString();
}
