package com.ReversePolishNotation;


public abstract class Node {
    protected abstract double evaluate();
}


public class NodeFactory {
    public static Node getNode(char type) {
        Node node;
        switch(type) {
            case '+':{
                node = new AddOperator();
                break;
            }
            case '-':{
                node = new SubtractOperator();
                break;
            }
            case '*':{
                node =  new MultiplyOperator();
                break;
            }
            case '/':{
                node = new DivideOperator();
                break;
            }
            default:{
                node = new NumericNode();
            }

        }
    }
}



