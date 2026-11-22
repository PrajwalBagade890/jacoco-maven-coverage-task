package com.example;

/**
 * A small class used to demonstrate unit testing and JaCoCo code coverage.
 */
public class Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public double divide(int first, int second) {
        if (second == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return (double) first / second;
    }

    public String classifyNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        }
        return "Zero";
    }
}
