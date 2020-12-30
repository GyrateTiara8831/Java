package com.app;

interface Expression{
    int interpret();
}

class NumberExpression implements Expression{
    Integer real;
    Integer imaginary;

    public NumberExpression(){}

    public NumberExpression(Integer real, Integer imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString(){
        if(imaginary>0){
            return real + "+" + imaginary + "i";
        }else{
            return real + "-" + imaginary + "i";
        }
    }

    public NumberExpression Add( NumberExpression cB ) {
        NumberExpression sum = new NumberExpression();

        sum.real     = real      + cB.real;
        sum.imaginary = imaginary + cB.imaginary;

        return (sum);
    }

    @Override
    public int interpret() {
        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
        NumberExpression cA = new NumberExpression(1, 2);
        NumberExpression cB = new NumberExpression(1,5);
        System.out.println("Complex number cA = " + cA.toString() );
        System.out.println("Complex number cB = " + cB.toString() );
        NumberExpression cC = cA.Add(cB);
        System.out.println("Complex   cA + cB = " + cC.toString() );
    }
}