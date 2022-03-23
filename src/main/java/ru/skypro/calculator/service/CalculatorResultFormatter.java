package ru.skypro.calculator.service;

public interface CalculatorResultFormatter {

    String getFormattedMinusResult(int num1, int num2);

    String getFormattedPlusResult(int num1, int num2);

    String getFormattedMultiplyResult(int num1, int num2);

    String getFormattedDivideResult(int num1, int num2);
}
