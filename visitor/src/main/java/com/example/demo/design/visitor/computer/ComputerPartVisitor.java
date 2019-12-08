package com.example.demo.design.visitor.computer;

import com.example.demo.design.visitor.computer.impl.Computer;
import com.example.demo.design.visitor.computer.impl.Keyboard;
import com.example.demo.design.visitor.computer.impl.Monitor;
import com.example.demo.design.visitor.computer.impl.Mouse;

/**
 * @author yao
 * @date 2019/12/8
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);

}
