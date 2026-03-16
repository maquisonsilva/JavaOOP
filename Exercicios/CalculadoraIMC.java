package Exercicios;
import java.util.Scanner;


public class CalculadoraIMC {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o seu peso em Kg: ");
    double peso = scanner.nextDouble();

    System.out.println("Digite sua altura em m: ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);

    if(imc < 18.5) {
        System.out.println("Abaixo do peso");
    } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Peso normal");
    } else if (imc >= 25 && imc < 29.9) {
        System.out.println("Sobrepeso");
    } else {
        System.out.println("Obesidade");
    }


    scanner.close();


    }
    
}
