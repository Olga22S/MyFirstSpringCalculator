package ru.skypro.calculator.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorServiceTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void givenTwoAndThreeWhenSumArgsThenReturnFive() {
        int result = out.plus(2, 3);
        assertEquals(result, 5);
    }

    @Test
    public void givenTenAndFiveWhenSumArgsThenReturnFifteen() {
        int result = out.plus(10, 5);
        assertEquals(result, 15);
    }

    @Test
    public void givenSevenAndThreeWhenMinusArgsThenReturnFour() {
        int result = out.minus(7, 3);
        assertEquals(result, 4);
    }

    @Test
    public void givenTenAndTenWhenMinusArgsThenReturnZero() {
        int result = out.minus(10, 10);
        assertEquals(result, 0);
    }

    @Test
    public void givenOneAndZeroWhenMultiplyArgsThenReturnZero() {
        int result = out.multiply(1, 0);
        assertEquals(result, 0);
    }

    @Test
    public void givenTenAndSixWhenMultiplyArgsThenReturnSixty() {
        int result = out.multiply(10, 6);
        assertEquals(result, 60);
    }

    @Test
    public void givenNineAndThreeWhenDivideArgsThenReturnThree() {
        int result = out.divide(9, 3);
        assertEquals(result, 3);
    }

    @Test
    public void givenTenAndTenWhenDivideArgsThenReturnOne() {
        int result = out.divide(10, 10);
        assertEquals(result, 1);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(10, 0));
    }
}
