package ru.skypro.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.calculator.service.CalculatorResultFormatter;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private final CalculatorResultFormatter formatterCalculatorResult;

    public Controller(CalculatorResultFormatter formatterCalculatorResult) {
        this.formatterCalculatorResult = formatterCalculatorResult;
    }

    @GetMapping
    public String getGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return formatterCalculatorResult.getFormattedPlusResult(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return formatterCalculatorResult.getFormattedMinusResult(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return formatterCalculatorResult.getFormattedMultiplyResult(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return formatterCalculatorResult.getFormattedDivideResult(num1, num2);
    }
}
