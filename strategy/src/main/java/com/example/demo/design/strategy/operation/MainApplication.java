package com.example.demo.design.strategy.operation;

import com.example.demo.design.strategy.operation.impl.AddOperation;
import com.example.demo.design.strategy.operation.impl.MultiOperation;
import com.example.demo.design.strategy.operation.impl.SubOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/8
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        OperationContext context = new OperationContext(new AddOperation());
        log.info("10 + 5 = {}", context.executeOperation(10, 5) );

        context = new OperationContext(new SubOperation());
        log.info("15 - 5 = {}", context.executeOperation(15, 5));

        context = new OperationContext(new MultiOperation());
        log.info("5 * 8 = {}", context.executeOperation(5, 8));
    }
}
