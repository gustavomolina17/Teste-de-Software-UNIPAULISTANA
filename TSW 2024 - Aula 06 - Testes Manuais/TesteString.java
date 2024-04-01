/* Teste Manual 01 - Verifica se uma string está vazia
 * 
 * Autor: Profº Ms Gustavo Molina
 * 01/04/2024
 * 
 */

public class TesteString {

    public static void main(String[] args) {
        testarStringVazia();
    }

    public static void testarStringVazia() {
        String texto = "";

        if (texto.isEmpty()) {
            System.out.println("Teste bem-sucedido: string vazia");
        } else {
            System.out.println("Teste falhou: string não está vazia");
        }
    }
}