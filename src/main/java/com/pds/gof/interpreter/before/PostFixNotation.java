package com.pds.gof.interpreter.before;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostFixNotation {

    private final String expression;

    public PostFixNotation(String expression) {
        this.expression = expression;
    }

    public void calculate() {
        Deque<Integer> numbers = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            switch (c) {
                case '+' -> numbers.push(numbers.pop() + numbers.pop());
                case '-' -> numbers.push(-numbers.pop() + numbers.pop());
                default -> numbers.push(Integer.parseInt(c + ""));
            }
        }
        System.out.println(numbers.pop());
    }

    public static void main(String[] args) {
        PostFixNotation postFixNotation = new PostFixNotation("312+-");
        postFixNotation.calculate();
    }
}
