package ru.skypro.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam String num1, @RequestParam String num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam String num1, @RequestParam String num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam String num1, @RequestParam String num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam String num1, @RequestParam String num2) {
        return calculatorService.divide(num1, num2);
    }
}
