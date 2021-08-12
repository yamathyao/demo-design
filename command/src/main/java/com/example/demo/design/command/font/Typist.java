package com.example.demo.design.command.font;

import lombok.extern.slf4j.Slf4j;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yao
 * @date 2019/12/5
 */
@Slf4j
public class Typist {

    private Deque<AbstractCommand> redoStack = new LinkedList<>();

    private Deque<AbstractCommand> undoStack = new LinkedList<>();

    public void cast(AbstractCommand command, AbstractFont font) {
        log.info("{} is handle this command {}, font is {}", this, command, font);
        command.execute();
        undoStack.offerLast(command);
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            AbstractCommand command = redoStack.pollLast();
            undoStack.offerLast(command);
            log.info("{} is handling redo command that ' {} '", this, command);
            command.redo();
        } else {
            log.info("No redo command");
        }
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            AbstractCommand command = undoStack.pollLast();
            redoStack.offerLast(command);
            log.info("{} is handling undo command that ' {} '", this, command);
            command.undo();
        } else {
            log.info("No undo command");
        }
    }

    @Override
    public String toString() {
        return "Typist";
    }
}
