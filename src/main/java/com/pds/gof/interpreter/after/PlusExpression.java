package com.pds.gof.interpreter.after;

import java.util.Map;

public class PlusExpression implements PostFixExpression {

    private final PostFixExpression left;
    private final PostFixExpression right;

    public PlusExpression(PostFixExpression left, PostFixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
