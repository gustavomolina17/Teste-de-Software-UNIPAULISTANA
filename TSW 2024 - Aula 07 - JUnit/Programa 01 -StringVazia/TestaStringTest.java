import org.junit.jupiter.api.Assertions;
	import org.junit.jupiter.api.Test;




public class TestaStringTest {

	
	    @Test
	    public void testVerificarStringVazia() {
	        String texto = "a"; // String vazia a ser testada
	        Assertions.assertTrue(verificarStringVazia(texto));
	    }

	    @Test
	    public void testVerificarStringNaoVazia() {
	        String texto = "Olá, mundo!"; // String não vazia a ser testada
	        Assertions.assertFalse(verificarStringVazia(texto));
	    }

	    private boolean verificarStringVazia(String texto) {
	        return texto.isEmpty();
	    }
	}
