package com.ReversePolishNotation;

public class NumericNode extends Node{
    private double value;
    public NumericNode(double val) {
        this.value = val;
    }
    protected double evaluate() {
        return this.value;
    }
}
