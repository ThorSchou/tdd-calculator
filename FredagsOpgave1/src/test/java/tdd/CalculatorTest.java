package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("add")
    void add(){
        int expected = 5;
        int actual =calc.add(2,3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtract")
    void subtract(){
        int expected = 5;
        int actual = calc.subtract(8,3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiply")
    void multiply(){
        int expected = 6;
        int actual = calc.multiply(2,3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Divide")
    void divide(){
        int expected = 6;
        int actual = calc.divide(12, 2);
        assertEquals(expected, actual);
    }
}