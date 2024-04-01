/* Teste Manual 02 - Verifica se o número digitado pelo usuário é par
 * 
 * Autor: Profº Ms Gustavo Molina
 * 01/04/2024
 * 
 */

import java.util.Scanner;

public class TestePar {

    public static void main(String[] args) {
        testarNumeroPar();
    }

    public static void testarNumeroPar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Teste bem-sucedido: o número é par");
        } else {
            System.out.println("Teste falhou: o número não é par");
        }
        scanner.close();
    }
    
}