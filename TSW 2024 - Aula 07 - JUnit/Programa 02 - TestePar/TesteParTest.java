
/* Teste JUnit 02 - Verifica se o número digitado pelo usuário é par
 * 
 * Autor: Profº Ms Gustavo Molina
 * 08/04/2024
 * 
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteParTest {

    @Test
    public void testVerificarNumeroPar() {
        int numero = 10; // Número par a ser testado
        Assertions.assertTrue(verificarNumeroPar(numero));
    }

    @Test
    public void testVerificarNumeroImpar() {
        int numero = 6; // Número ímpar a ser testado
        Assertions.assertFalse(verificarNumeroPar(numero));
    }

    private boolean verificarNumeroPar(int numero) {
        return numero % 2 == 0;
    }
}