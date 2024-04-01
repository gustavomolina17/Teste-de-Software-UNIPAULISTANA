/* Teste Manual 04 - Verifica qual de duas datas digitadas pelo usuário é posterior.
 * 
 * Autor: Profº Ms Gustavo Molina
 * 01/04/2024
 * 
 */



import java.time.LocalDate;
import java.util.Scanner;

public class TesteDatas {

    public static void main(String[] args) {
        testarDataPosterior();
    }

    public static void testarDataPosterior() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira data (no formato AAAA-MM-DD): ");
        String data1Input = scanner.nextLine();
        LocalDate data1 = LocalDate.parse(data1Input);

        System.out.print("Digite a segunda data (no formato AAAA-MM-DD): ");
        String data2Input = scanner.nextLine();
        LocalDate data2 = LocalDate.parse(data2Input);

        if (data2.isAfter(data1)) {
            System.out.println("Teste bem-sucedido: a segunda data é posterior à primeira data");
        } else {
            System.out.println("Teste falhou: a segunda data não é posterior à primeira data");
        }
        scanner.close();
    }
}