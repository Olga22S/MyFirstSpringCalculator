package ru.skypro.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.skypro.calculator.constants.CalculatorServiceTestConstants.*;

@SpringBootTest
public class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorService();

    @Test
    public void shouldAddTwoAndThreeAndReturnResultAsString() {
        String result = out.plus("2", "3");
        assertEquals(result, TWO_PLUS_THREE);
    }

    @Test
    public void shouldAddTenAndFiveAndReturnResultAsString() {
        String result = out.plus("10", "5");
        assertEquals(result, TEN_PLUS_FIVE);
    }

    @Test
    public void shouldMinisThreeFromSevenAndReturnResultAsString() {
        String result = out.minus("7", "3");
        assertEquals(result, SEVEN_MINUS_THREE);
    }

    @Test
    public void shouldMinusTenFromTenAndReturnResultAsString() {
        String result = out.minus("10", "10");
        assertEquals(result, TEN_MINUS_TEN);
    }

    @Test
    public void shouldMultiplyOneByZeroAndReturnResultAsString() {
        String result = out.multiply("1", "0");
        assertEquals(result, ONE_MULTIPLY_ZERO);
    }

    @Test
    public void shouldMultiplyTenBySixAndReturnResultAsString() {
        String result = out.multiply("10", "6");
        assertEquals(result, TEN_MULTIPLY_SIX);
    }

    @Test
    public void shouldDivideNineByThreeAndReturnResultAsString() {
        String result = out.divide("9", "3");
        assertEquals(result, NINE_DIVIDE_THREE);
    }

    @Test
    public void shouldDivideTenByTenAndReturnResultAsString() {
        String result = out.divide("10", "10");
        assertEquals(result, TEN_DIVIDE_TEN);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divide("10", "0"));
    }
}
