package com.example.demo.design.command.font;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
@Slf4j
public class Enlarge extends AbstractCommand {

    private final Size oriSize;

    private final AbstractFont font;

    public Enlarge(AbstractFont font) {
        this.font = font;
        oriSize = font.getSize();
    }

    @Override
    public void execute() {
        font.setSize(Size.LARGE);
    }

    @Override
    public void redo() {
        execute();
    }

    @Override
    public void undo() {
        font.setSize(oriSize);
    }

    @Override
    public String toString() {
        return "Set font size to 'Large'";
    }
}
