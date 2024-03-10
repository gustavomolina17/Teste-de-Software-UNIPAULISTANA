/*
 * Professor Ms Gustavo Molina
 * Disciplina: Teste de Software
 * 10/03/2024
 * 
*/

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor booleano para a: ");
        boolean a = scanner.nextBoolean();

        System.out.print("Digite um valor booleano para b: ");
        boolean b = scanner.nextBoolean();

        // Operador lógico AND (E)
        boolean and = a && b;
        System.out.println("AND: " + and);

        // Operador lógico OR (OU)
        boolean or = a || b;
        System.out.println("OR: " + or);

        // Operador lógico NOT (NÃO)
        boolean notA = !a;
        boolean notB = !b;
        System.out.println("NOT a: " + notA);
        System.out.println("NOT b: " + notB);

        scanner.close();
    }
}