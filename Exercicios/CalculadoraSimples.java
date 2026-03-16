package Exercicios;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double operador1 = 0;
        double operador2 = 0;
        int seletor = 0;
        
        System.out.println("Seleciona uma das operações abaixo:");
        System.out.println("1 -  Soma (+)");
        System.out.println("2 -  Subtração (-)");
        System.out.println("3 -  Multiplicação (*)");
        System.out.println("4 -  para Divisão (/)");
        seletor = scanner.nextInt();

        System.out.println("Digite o primeiro número");
        operador1 = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        operador2 = scanner.nextDouble();


        

        if(seletor <= 0 || seletor > 4) {
            System.out.println("Opção Inválida, selecione um número de 1 à 4.");            
        } else if(seletor == 4 && (operador1 == 0 || operador2 == 0)) {
            System.out.println("O resultado da operação é: 0");
        } else if(seletor == 3 && (operador1 == 0 || operador2 == 0)) {
            System.out.println("O resultado da operação é: 0");            
        } else {
            System.out.println("O resulado da operação é: " + operaçõesCalc(operador1, operador2, seletor));
        }
        

        scanner.close();
    }

    public static double operaçõesCalc(double n1, double n2, int n3) {
        double result = 0;

        if(n3 == 1) {
            result = n1 + n2;
        } else if(n3 == 2) {
            result = n1 - n2;
        } else if(n3 == 3) {
            result = n1 * n2;
        } else if(n3 == 4) {
            result = n1 / n2;
        }

        return result; 
    }
    
}
