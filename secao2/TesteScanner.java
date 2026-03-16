package secao2;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {

        // 1 - Testando scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + "!");

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos.");

        // 2 - Problema do scanner: nextLine
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite um texto: ");
        String txt = scanner.nextLine();
        System.out.println("Os dados são, n = " + n + " e txt = " + txt);

        // Fechamento do scanner para evitar memory lick.
        scanner.close();
        
    }
}
