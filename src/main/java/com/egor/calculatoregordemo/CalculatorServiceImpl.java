

package com.egor.calculatoregordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(Integer num1, Integer num2){
        return num1 + num2;
    }
    @Override
    public int difference(Integer num1, Integer num2){
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2){
        return num1 * num2;
    }

    @Override
    public double divide(Integer num1, Integer num2){
        return (double) num1/num2;
    }
}
