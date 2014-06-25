package com.ReversePolishNotation;

public class AddOperator extends OperatorNode {

    public AddOperator(Node l, Node r) {
        left = l;
        right = r;
    }

    @Override
    protected double evaluate() {
       return left.evaluate() + right.evaluate();
    }
}
