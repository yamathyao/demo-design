package com.example.demo.design.visitor.computer.impl;

import com.example.demo.design.visitor.computer.ComputerPart;
import com.example.demo.design.visitor.computer.ComputerPartVisitor;

/**
 * @author yao
 * @date 2019/12/8
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
