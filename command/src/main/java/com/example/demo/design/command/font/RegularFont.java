package com.example.demo.design.command;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
public class RegularFont extends AbstractFont {

    public RegularFont() {
        setColor(Color.BLACK);
        setSize(Size.SMALL);
    }

    @Override
    public String toString() {
        return "RegularFont";
    }
}
