package com.egor.calculatoregordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String sayHello(){
            return "Hello!";
    }
    @GetMapping(path = "/plus")
    public String sum(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        if(num1 == null || num2 == null){
            return "Введите оба числа";
        }
        return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String difference(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        if(num1 == null || num2 == null){
            return "Введите оба числа";
        }
        return num1 + " - " + num2 + " = " + calculatorService.difference(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        if(num1 == null || num2 == null){
            return "Введите оба числа";
        }
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        if(num1 == null || num2 == null){
            return "Введите оба числа";
        } else if(num2 == 0){
            return "На ноль делить нельзя";
        }
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
