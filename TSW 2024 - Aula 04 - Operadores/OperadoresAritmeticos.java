/*
 * Professor Ms Gustavo Molina
 * Disciplina: Teste de Software
 * 10/03/2024
 * 
*/

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        // Operador de adição
        int soma = a + b;
        System.out.println("Soma: " + soma);

        // Operador de subtração
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        // Operador de multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        // Operador de divisão
        int divisao = a / b;
        System.out.println("Divisão: " + divisao);

        // Operador de resto (módulo)
        int resto = a % b;
        System.out.println("Resto: " + resto);

        // Operador de incremento
        a++;
        System.out.println("Incremento de a: " + a);

        // Operador de decremento
        b--;
        System.out.println("Decremento de b: " + b);

        scanner.close();
    }
}