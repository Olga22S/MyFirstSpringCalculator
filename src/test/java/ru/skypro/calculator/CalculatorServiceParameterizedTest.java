package ru.skypro.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.skypro.calculator.constants.CalculatorServiceTestConstants.*;

public class CalculatorServiceParameterizedTest {

    private final CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForAddTests")
    public void givenTwoNumsThenReturnAddingResultAsString(String num1, String num2, String expectedResult) {
        String result = out.plus(num1, num2);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void givenTwoNumsThenReturnMinusResultAsString(String num1, String num2, String expectedResult) {
        String result = out.minus(num1, num2);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void givenTwoNumsThenReturnMultiplyingResultAsString(String num1, String num2, String expectedResult) {
        String result = out.multiply(num1, num2);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void givenTwoNumsThenReturnDividingResultAsString(String num1, String num2, String expectedResult) {
        String result = out.divide(num1, num2);
        assertEquals(result, expectedResult);
    }

    public static Stream<Arguments> provideParamsForAddTests() {
        return Stream.of(
                Arguments.of("2", "3", TWO_PLUS_THREE),
                Arguments.of("10", "5", TEN_PLUS_FIVE)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(
                Arguments.of("7", "3", SEVEN_MINUS_THREE),
                Arguments.of("10", "10", TEN_MINUS_TEN)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of("1", "0", ONE_MULTIPLY_ZERO),
                Arguments.of("10", "6", TEN_MULTIPLY_SIX)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of("9", "3", NINE_DIVIDE_THREE),
                Arguments.of("10", "10", TEN_DIVIDE_TEN)
        );
    }
}
