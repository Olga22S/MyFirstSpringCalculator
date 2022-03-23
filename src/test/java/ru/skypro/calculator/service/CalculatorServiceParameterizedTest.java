package ru.skypro.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForAddTests")
    public void givenTwoNumsThenReturnAddingResult(int num1, int num2, int expectedResult) {
        int result = out.plus(num1, num2);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void givenTwoNumsThenReturnMinusResult(int num1, int num2, int expectedResult) {
        int result = out.minus(num1, num2);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void givenTwoNumsThenReturnMultiplyingResult(int num1, int num2, int expectedResult) {
        int result = out.multiply(num1, num2);
        assertEquals(result, expectedResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void givenTwoNumsThenReturnDividingResult(int num1, int num2, int expectedResult) {
        int result = out.divide(num1, num2);
        assertEquals(result, expectedResult);
    }

    public static Stream<Arguments> provideParamsForAddTests() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(10, 5, 15)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(
                Arguments.of(7, 3, 4),
                Arguments.of(10, 10, 0)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(1, 0, 0),
                Arguments.of(10, 6, 60)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(9, 3, 3),
                Arguments.of(10, 10, 1)
        );
    }
}
