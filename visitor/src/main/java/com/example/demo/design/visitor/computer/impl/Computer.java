package com.example.demo.design.visitor.computer.impl;

import com.example.demo.design.visitor.computer.ComputerPart;
import com.example.demo.design.visitor.computer.ComputerPartVisitor;

/**
 * @author yao
 * @date 2019/12/8
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Keyboard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
