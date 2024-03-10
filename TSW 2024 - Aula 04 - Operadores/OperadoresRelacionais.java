/*
 * Professor Ms Gustavo Molina
 * Disciplina: Teste de Software
 * 10/03/2024
 * 
*/

import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        // Operador de igualdade
        boolean igual = (a == b);
        System.out.println("Igual: " + igual);

        // Operador de desigualdade
        boolean diferente = (a != b);
        System.out.println("Diferente: " + diferente);

        // Operador maior que
        boolean maiorQue = (a > b);
        System.out.println("Maior que: " + maiorQue);

        // Operador maior ou igual que
        boolean maiorOuIgualQue = (a >= b);
        System.out.println("Maior ou igual que: " + maiorOuIgualQue);

        // Operador menor que
        boolean menorQue = (a < b);
        System.out.println("Menor que: " + menorQue);

        // Operador menor ou igual que
        boolean menorOuIgualQue = (a <= b);
        System.out.println("Menor ou igual que: " + menorOuIgualQue);

        scanner.close();
    }
}