package com.example.demo.design.decorator.smith;

import com.example.demo.design.decorator.smith.impl.Carpenter;
import com.example.demo.design.decorator.smith.impl.Smith;

/**
 *
 * @author GEEX177
 * @date 2019/12/6
 */
public class MainApplication {

    public static void main(String[] args) {
        Operation carpenterOp = new Carpenter();
        carpenterOp.checkBefore();
        carpenterOp.join();
        carpenterOp.checkAfter();

        Operation smithOp = new Smith(new Carpenter());
        smithOp.checkBefore();
        smithOp.join();
        smithOp.checkAfter();
    }
}
