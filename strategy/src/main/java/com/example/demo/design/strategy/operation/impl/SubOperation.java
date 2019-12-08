package com.example.demo.design.strategy.operation.impl;

import com.example.demo.design.strategy.operation.OperationStrategy;

/**
 * @author yao
 * @date 2019/12/8
 */
public class SubOperation implements OperationStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
