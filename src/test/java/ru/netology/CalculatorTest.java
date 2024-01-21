package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = Calculator.instance.get();


    @Test
    void testIsPlus() {
        // given:
        int a = 4;
        int b = 2;

        // when:
        int result = calc.plus.apply(a, b);

        // then:
        assertEquals(6, result, "ожидаем 4 + 2 = 6");
    }

    @Test
    void testIsPow() {
        int a = 4;
        int result = calc.pow.apply(a);
        assertEquals(16, result, "ожидаем 4 * 4 = 16");
    }


    @Test
    void testDivideByZero() {
        int a = 4;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> calc.devide.apply(a, b), "Division by zero should throw ArithmeticException");
    }

}

