package com.example.demo.design.command.font;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
@Slf4j
public abstract class AbstractFont {

    @Getter
    @Setter
    private Size size;

    @Getter
    @Setter
    private Color color;

    @Override
    public abstract String toString();

    public void printFont() {
        log.info("Now size of the font is {} and color is {}", getSize(), getColor());
    }
}
