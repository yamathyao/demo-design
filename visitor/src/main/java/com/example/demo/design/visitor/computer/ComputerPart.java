package com.example.demo.design.visitor.computer;

/**
 * @author yao
 * @date 2019/12/8
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}
