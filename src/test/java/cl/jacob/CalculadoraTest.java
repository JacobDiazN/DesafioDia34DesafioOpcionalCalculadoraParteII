package cl.jacob;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test class Calculadora")
public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testSuma(){
        assertEquals(5, calculadora.suma(3,2));
    }

    @Test
    void testResta(){
        assertEquals(1, calculadora.resta(8,7));
    }

    @Test
    void testMutiplicacion(){
        assertEquals(100, calculadora.multiplicacion(10,10));
    }

    @Test
    void testDivision(){
        assertEquals(6.5, calculadora.division(26,4));
    }

    @Test
    void testDivisionPorCeroEnElprimerNumero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.division(0, 5);
        });
    }

    @Test
    void testDivisionPorCeroEnElSegundoNumero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.division(10, 0);
        });
    }

}
