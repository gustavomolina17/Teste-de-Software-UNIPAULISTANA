/* Teste Manual 04 - Calculadora
 * Autor: Profº Ms Gustavo Molina
 * 15/04/2024
 * 
 */


public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultadoSoma = calculadora.somar(2, 3);
        int resultadoSubtracao = calculadora.subtrair(5, 3);
        int resultadoMultiplicacao = calculadora.multiplicar(4, 3);
        double resultadoDivisao = calculadora.dividir(10, 2);

        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}