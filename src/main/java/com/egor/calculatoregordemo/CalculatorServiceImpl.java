

package com.egor.calculatoregordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String sayHello(){
        return "Hello!";
    }
    @Override
    public String sum(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            throw new NullPointerException("Введите оба числа");
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    @Override
    public String difference(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            throw new NullPointerException("Введите оба числа");
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            throw new NullPointerException("Введите оба числа");
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override
    public String divide(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            throw new NullPointerException("Введите оба числа");
        } else if(num2 == 0){
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        return num1 + " / " + num2 + " = " + (double)(num1 / num2);
    }
}
