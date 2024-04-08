/* Teste Manual 03 - Verifica se determinada lista apresenta um elemento desejado.
 * 
 * Autor: Profº Ms Gustavo Molina
 * 01/04/2024
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLista {

    public static void main(String[] args) {
        testarElementoLista();
    }

    public static void testarElementoLista() {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite uma fruta: ");
            String fruta = scanner.nextLine();
            lista.add(fruta);
        }

        System.out.print("Digite a fruta a ser verificada: ");
        String frutaVerificada = scanner.nextLine();

        if (lista.contains(frutaVerificada)) {
            System.out.println("Teste bem-sucedido: a lista contém a fruta " + frutaVerificada);
        } else {
            System.out.println("Teste falhou: a lista não contém a fruta " + frutaVerificada);
        }
        scanner.close();
    }
}