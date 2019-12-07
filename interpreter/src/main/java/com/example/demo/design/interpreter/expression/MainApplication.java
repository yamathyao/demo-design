package com.example.demo.design.interpreter.expression;

import com.example.demo.design.interpreter.expression.impl.AndExpression;
import com.example.demo.design.interpreter.expression.impl.OrExpression;
import com.example.demo.design.interpreter.expression.impl.TerminalExpression;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/7
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        log.info("John is male? " + isMale.interpret("John"));
        log.info("Julie is a married woman? " + isMarriedWoman.interpret("Julie Married"));
    }

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(julie, married);
    }
}
