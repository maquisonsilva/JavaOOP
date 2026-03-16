package Exercicios;
import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = scanner.nextDouble();

        converterTemperatura(temperatura);
        double tempResult = converterTemperatura(temperatura);

        System.out.println("A temperatura em Fahrenheit é " + tempResult);

        scanner.close();
        
    }

    // Celsius -> Fihrenheit | formula: C x (9/5) = r + 32

    public static double converterTemperatura(double celsius) {

        double result = (celsius * 9 / 5) + 32; 
        
        return result;
    }

    
}
