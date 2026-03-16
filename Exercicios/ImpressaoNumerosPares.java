package Exercicios;

public class ImpressaoNumerosPares {
    public static void main(String[] args) {
        //Exercicio 02: Impressão de números pares.

         int numerosPares = 1;

         while (numerosPares <= 20) {

            if(numerosPares % 2 == 0) {

                System.out.println("O numero par é: " + numerosPares);

            }
                

            numerosPares++;
         }
    }
    
}
