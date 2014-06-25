package com.ReversePolishNotation;

public class MultiplyOperator extends OperatorNode {

    public MultiplyOperator(Node l, Node r) {
        left = l;
        right = r;
    }

    @Override
    protected double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
