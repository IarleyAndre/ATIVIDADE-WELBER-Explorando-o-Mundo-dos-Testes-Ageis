import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    @DisplayName("Deve somar dois números corretamente")
    void testarSoma() {
        // CORRIGIDO: Os "a:" e "b:" foram removidos
        assertEquals(8, calc.somar(5, 3));
        assertEquals(0, calc.somar(0, 0));
        assertEquals(-2, calc.somar(-1, -1));
    }

    @Test
    @DisplayName("Deve subtrair dois números corretamente")
    void testarSubtracao() {
        // CORRIGIDO: Os "a:" e "b:" foram removidos
        assertEquals(2, calc.subtrair(5, 3));
        assertEquals(10, calc.subtrair(5, -5));
    }

    @Test
    @DisplayName("Deve Multiplicar dois números corretamente")
    void testarMultiplicacao() {
        // CORRIGIDO: Os "a:" e "b:" foram removidos
        assertEquals(15, calc.multiplicar(5, 3));
        assertEquals(0, calc.multiplicar(10, 0));
        assertEquals(-20, calc.multiplicar(10, -2));
    }

    @Test
    @DisplayName("Deve dividir dois números corretamente (divisão válida)")
    void testarDivisaoValida() {
        // CORRIGIDO: Os "a:" e "b:" foram removidos
        assertEquals(5.0, calc.dividir(10, 2));
        assertEquals(2.5, calc.dividir(5, 2));
    }

    @Test
    @DisplayName("Deve lançar ArithmeticException ao dividir por zero")
    void testarDivisaoPorZero() {
        
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            // Este não tinha o erro de "a:" ou "b:"
            calc.dividir(10, 0);
        });

        assertEquals("Divisão por zero!", exception.getMessage());
    }
}
