package com.example.demo.design.visitor.computer.impl;

import com.example.demo.design.visitor.computer.ComputerPartVisitor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/8
 */
@Slf4j
public class VisitorDisplay implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        log.info("Displaying computer.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        log.info("Displaying keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        log.info("Displaying mouse.");
    }

    @Override
    public void visit(Monitor monitor) {
        log.info("Displaying monitor");
    }
}
