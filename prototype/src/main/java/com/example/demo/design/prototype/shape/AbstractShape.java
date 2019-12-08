package com.example.demo.design.prototype.shape;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/7
 */
@Slf4j
public abstract class AbstractShape implements Cloneable {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    protected String type;

    abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            log.info(e.getMessage(), e);
        }
        return clone;
    }
}
