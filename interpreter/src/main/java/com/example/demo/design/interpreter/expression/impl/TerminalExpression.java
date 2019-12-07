package com.example.demo.design.interpreter.expression.impl;

import com.example.demo.design.interpreter.expression.Expression;

/**
 * @author yao
 * @date 2019/12/7
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
