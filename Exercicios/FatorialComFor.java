package Exercicios;

public class FatorialComFor {
    public static void main(String[] args) {
        
        // Exercicio 01: Fatorial

        int nFatorial = 3;
        int fatorial = 1;
        
        for(int i = 1; i <= nFatorial; i++) {
            
            fatorial *= i;
        }

        System.out.println("O fatorial de " + nFatorial + " é igual a " + fatorial);

        // Exercicio 02: Contagem de dígitos de um número

        int numeroParaContar = 1000;

        int contador = 0;

        while (numeroParaContar != 0) {
            
            numeroParaContar = numeroParaContar / 10;

            contador++;
        }

        System.out.println("Número de dígitos: " + contador);

    }
    
}
