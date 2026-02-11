package secao4;
import java.util.Scanner;

public class ConversonCelFarh {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleciona qual o tipo de conversão: C - para Celsio e F - para Fahrenheit: ");
        String selecao = scanner.next().toUpperCase();

        System.out.println("Digite a temperatura para conversão>: ");
        double tempValor = scanner.nextDouble();

        if(selecao.equals("C")) {
            System.out.println(resultCelsio(tempValor)); 
        } else if(selecao.equals("F")) {
            System.out.println(resultFahrenheit(tempValor)); 
        } else {

            System.out.println("Valor de conversão inválido");
        }

        scanner.close();
    }

    public static String resultCelsio(double c) {

        double seletor = ((c * 9 / 5) + 32);

        return "A temperatúra convertida para Celsio é: " + seletor;

    }

    public static String resultFahrenheit(double f) {

        double seletor = ((f - 32) * 9 / 5);

        return "A temperatúra convertida para Fahrenheit é: " + seletor;

    }

    
}
