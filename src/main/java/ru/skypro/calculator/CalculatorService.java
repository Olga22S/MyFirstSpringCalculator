package ru.skypro.calculator;

import org.springframework.stereotype.Service;

import static java.lang.Integer.parseInt;

@Service
public class CalculatorService {

    public String plus(String num1, String num2) {
        if (checkParams(num1, num2)) {
            return "Error arguments!";
        }
        return String.format(num1 + " + " + num2 + " = " + "%d", parseInt(num1) + parseInt(num2));
    }

    public String minus(String num1, String num2) {
        if (checkParams(num1, num2)) {
            return "Error arguments!";
        }
        return String.format(num1 + " - " + num2 + " = " + "%d", parseInt(num1) - parseInt(num2));
    }

    public String multiply(String num1, String num2) {
        if (checkParams(num1, num2)) {
            return "Error arguments!";
        }
        return String.format(num1 + " * " + num2 + " = " + "%d", parseInt(num1) * parseInt(num2));
    }

    public String divide(String num1, String num2) {
        if (checkParams(num1, num2)) {
            return "Error arguments!";
        }
        if (num2.equals("0")) {
            throw new IllegalArgumentException("It's forbidden to divide by zero!");
        }
        return String.format(num1 + " / " + num2 + " = " + "%d", parseInt(num1) / parseInt(num2));
    }

    private boolean checkParams(String num1, String num2) {
        return  (num1.isEmpty() || num2.isEmpty());
    }
}
