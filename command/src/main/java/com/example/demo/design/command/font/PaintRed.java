package com.example.demo.design.command;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
public class PaintRed extends AbstractCommand {

    private final AbstractFont font;

    private final Color oriColor;

    public PaintRed(AbstractFont font) {
        this.font = font;
        oriColor = font.getColor();
    }

    @Override
    public void execute() {
        font.setColor(Color.RED);
    }

    @Override
    public void redo() {
        execute();
    }

    @Override
    public void undo() {
        font.setColor(oriColor);
    }

    @Override
    public String toString() {
        return "Set font color to 'Red'";
    }
}
