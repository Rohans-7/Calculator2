package com.devops;

public class Calculator {
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public double naturalLog(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Logarithm is not defined for zero or negative numbers");
        }
        return Math.log(num);
    }

    public double power(double x, double b) {
        return Math.pow(x, b);
    }
}