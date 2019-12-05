package com.example.demo.design.command;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
public class MainApplication {

    public static void main(String[] args) {
        AbstractFont font = new RegularFont();
        AbstractCommand enlarge = new Enlarge(font);
        AbstractCommand paintRed = new PaintRed(font);

        Typist typist = new Typist();

        font.printFont();

        typist.cast(enlarge, font);
        font.printFont();
        typist.redo();
        font.printFont();
        typist.undo();
        font.printFont();
        typist.redo();
        font.printFont();
        typist.cast(paintRed, font);
        font.printFont();
        typist.undo();
        font.printFont();
        typist.redo();
        font.printFont();
    }
}
