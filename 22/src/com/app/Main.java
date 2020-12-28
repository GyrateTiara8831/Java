package com.app;

import java.util.Stack;

interface Expression{
    int interpreter(Expression context);
}

class Renumber implements Expression{
    int renumber;

    public Renumber(int renumber){
        this.renumber = renumber;
    }

    @Override
    public int interpreter(Expression context) {
        return renumber;
    }
}

class Imnumber implements Expression{
    int imnuber;

    public Imnumber(int imnuber){
        this.imnuber = imnuber;
    }

    @Override
    public int interpreter(Expression context) {
        return imnuber;
    }
}

class Plus implements Expression{
    Expression expressionLift;
    Expression expressionRight;

    public Plus(Expression expressionLift, Expression expressionRight){
        this.expressionLift = expressionLift;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpreter(Expression context) {
        return expressionLift.interpreter(context) + expressionRight.interpreter(context);
    }
}

class Evaluete implements Expression {

    Expression evaluate;

    public Evaluete(String expression){
        Stack<Expression> expressions = new Stack<>();
        for (String s : expression.split("\\D")){
                expressions.push(new Renumber(Integer.parseInt(s)));
        }
        for(String s: expression.split("\\d")){
            if(s.equals("+")){
                expressions.push(new Plus(expressions.pop(), expressions.pop()));
            }
        }
        evaluate = expressions.pop();
    }

    @Override
    public int interpreter(Expression context) {
        return evaluate.interpreter(context);
    }
}


public class Main {
    public static void main(String[] args) {
        String expression =  "1+2";//1+2i
        Expression evaluator = new Evaluete(expression);
        System.out.println(evaluator.interpreter(evaluator));
    }
}
