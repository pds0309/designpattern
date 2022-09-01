package com.pds.gof.interpreter.after;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        PostFixExpression postFixExpression = PostFixParser.parse("xyz+-");
        int result = postFixExpression.interpret(Map.of('x', 1, 'y', 2, 'z', 6));
        System.out.println(result);
    }
}
