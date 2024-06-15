package cl.jacob;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test class Calculadora")
public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSuma(){
        assertEquals(5.0, calculadora.suma(3.0f, 2.0f), 0.0001);
    }

    @Test
    public void testResta(){
        assertEquals(1.0, calculadora.resta(8.0f, 7.0f), 0.0001);
    }

    @Test
    public void testMultiplicacion(){
        assertEquals(100.0, calculadora.multiplicacion(10.0f, 10.0f), 0.0001);
    }

    @Test
    public void testDivision(){
        assertEquals(6.5, calculadora.division(26.0f, 4.0f), 0.0001);
    }

    @Test
    public void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.division(10.0f, 0.0f);
        });
    }
}
