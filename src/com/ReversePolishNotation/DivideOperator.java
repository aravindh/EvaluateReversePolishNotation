package com.ReversePolishNotation;

public class DivideOperator extends OperatorNode {

    public DivideOperator(Node l, Node r) {
        left = l;
        right = r;
    }

    @Override
    protected double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
