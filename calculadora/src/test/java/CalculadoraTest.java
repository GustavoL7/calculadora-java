import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void testSomarNumerosPositivos() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.somar(3, 5));
    }

    @Test
    void testSomarNumerosNegativos() {
        Calculadora calc = new Calculadora();
        assertEquals(-8, calc.somar(-3, -5));
    }

    @Test
    void testSomarComZero() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(0, 5));
    }

    @Test
    void testSubtrairNumerosPositivos() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.subtrair(5, 3));
    }

    @Test
    void testSubtrairNumerosNegativos() {
        Calculadora calc = new Calculadora();
        assertEquals(-2, calc.subtrair(-5, -3));
    }

    @Test
    void testSubtrairComZero() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.subtrair(5, 0));
    }
}
