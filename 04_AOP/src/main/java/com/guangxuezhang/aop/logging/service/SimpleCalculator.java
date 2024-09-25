package com.guangxuezhang.aop.logging.service;

import org.springframework.stereotype.Component;

@Component
public class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("Adding two numbers");
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("Subtracting two numbers");
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("Multiplying two numbers");
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("Dividing two numbers");
        return a/b;
    }
}
