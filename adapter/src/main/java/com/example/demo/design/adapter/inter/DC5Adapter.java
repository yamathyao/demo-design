package com.example.demo.design.adapter.inter;

/**
 * 5V adapter
 *
 * @author GEEX177
 * @date 2019/12/3
 */
public interface DC5Adapter {

    boolean support(Ac ac);

    int outputDC5V(Ac ac);
}
