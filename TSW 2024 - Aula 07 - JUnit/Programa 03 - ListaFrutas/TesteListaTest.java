import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteListaTest {

    @Test
    public void testVerificarElementoExistente() {
        List<String> lista = new ArrayList<>(Arrays.asList("maçã", "banana", "laranja", "uva", "abacaxi"));
        String frutaVerificada = "laranja";
        Assertions.assertTrue(verificarElementoLista(lista, frutaVerificada));
    }

    @Test
    public void testVerificarElementoInexistente() {
        List<String> lista = new ArrayList<>(Arrays.asList("maçã", "banana", "laranja", "uva", "abacaxi"));
        String frutaVerificada = "pêra";
        Assertions.assertFalse(verificarElementoLista(lista, frutaVerificada));
    }

    private boolean verificarElementoLista(List<String> lista, String frutaVerificada) {
        return lista.contains(frutaVerificada);
    }
}
