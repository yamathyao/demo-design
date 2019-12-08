package com.example.demo.design.visitor.computer;

import com.example.demo.design.visitor.computer.impl.Computer;
import com.example.demo.design.visitor.computer.impl.VisitorDisplay;

/**
 * @author yao
 * @date 2019/12/8
 */
public class MainApplication {

    public static void main(String[] args) {
        ComputerPart part = new Computer();
        part.accept(new VisitorDisplay());
    }
}
