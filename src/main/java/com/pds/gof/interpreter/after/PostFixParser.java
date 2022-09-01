package com.pds.gof.interpreter.after;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostFixParser {

    public static PostFixExpression parse(String expression) {
        Deque<PostFixExpression> numbers = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            switch (c) {
                case '+' -> numbers.push(new PlusExpression(numbers.pop(), numbers.pop()));
                case '-' -> numbers.push(new MinusExpression(numbers.pop(), numbers.pop()));
                default -> numbers.push(new VariableExpression(c));
            }
        }
        return numbers.pop();
    }
}
