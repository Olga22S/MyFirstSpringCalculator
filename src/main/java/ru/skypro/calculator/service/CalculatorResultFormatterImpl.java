package ru.skypro.calculator.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorResultFormatterImpl implements CalculatorResultFormatter {

    private final CalculatorService calculatorService;

    public CalculatorResultFormatterImpl(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @Override
    public String getFormattedMinusResult(int num1, int num2) {
        int result = calculatorService.minus(num1, num2);
        return String.format(num1 + " - " + num2 + " = " + "%d", result);
    }

    @Override
    public String getFormattedPlusResult(int num1, int num2) {
        int result = calculatorService.plus(num1, num2);
        return String.format(num1 + " + " + num2 + " = " + "%d", result);
    }

    @Override
    public String getFormattedMultiplyResult(int num1, int num2) {
        int result = calculatorService.multiply(num1, num2);
        return String.format(num1 + " * " + num2 + " = " + "%d", result);
    }

    @Override
    public String getFormattedDivideResult(int num1, int num2) {
        int result = calculatorService.divide(num1, num2);
        return String.format(num1 + " / " + num2 + " = " + "%d", result);
    }
}
