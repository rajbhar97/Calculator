package com.example.calculator;

public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculation(){
        switch (getOperator()){
            case'+':
                return getOperand1()+getOperand2();
            case '-':
                return getOperand1()-getOperand2();
            case '*':
                return  getOperand1()*getOperand2();
            case'/':
                return getOperand1()/getOperand2();
            case'√':
                return Math.sqrt(getOperand1());
            case'^':
                return Math.pow(getOperand1(),getOperand2());
        }
        return 0;
    }

}
