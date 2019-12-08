package com.example.demo.design.strategy.operation;

/**
 * @author yao
 * @date 2019/12/8
 */
public class OperationContext {

    private OperationStrategy strategy;

    public OperationContext(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
