package com.pds.gof.template.good;

public class Divider {

    private final Policy policy;

    public Divider(Policy policy) {
        this.policy = policy;
    }

    public double divide(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return policy.setPolicy(a, b);
    }

    enum Policy implements DivideOperator {
        CEIL((a, b) -> Math.ceil(a / b)), FLOOR((a, b) -> Math.floor(a / b));

        private final DivideOperator divideOperator;

        Policy(DivideOperator divideOperator) {
            this.divideOperator = divideOperator;
        }

        @Override
        public double setPolicy(double a, double b) {
            return divideOperator.setPolicy(a, b);
        }
    }
}
