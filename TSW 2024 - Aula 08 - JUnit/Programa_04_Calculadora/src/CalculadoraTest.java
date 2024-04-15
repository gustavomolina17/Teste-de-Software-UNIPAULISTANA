/* Teste Automatizado 04 - Calculadora
 * Autor: Profº Ms Gustavo Molina
 * 15/04/2024
 * 
 */


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Teste somar")
    public void testSomar() {
        int resultado = calculadora.somar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    @DisplayName("Teste subtrair")
    public void testSubtrair() {
        int resultado = calculadora.subtrair(5, 3);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
        assertEquals(2, resultado, "Resultado incorreto!");
    }

    @Test
    @DisplayName("Teste multiplicar")
    public void testMultiplicar() {
        int resultado = calculadora.multiplicar(4, 3);
        assertNotEquals(0, resultado);
        assertTrue(resultado > 0);
        assertEquals(12, resultado);
    }

    @Test
    @DisplayName("Teste dividir")
    public void testDividir() {
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado, 0.01);
    }

    @Test
    @DisplayName("Teste dividir por zero")
    @Disabled("Não é permitido dividir por zero")
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}
