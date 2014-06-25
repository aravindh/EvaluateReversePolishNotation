package com.ReversePolishNotation;

public class SubtractOperator extends OperatorNode {

    public SubtractOperator(Node l, Node r) {
        left = l;
        right = r;
    }

    @Override
    protected double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
