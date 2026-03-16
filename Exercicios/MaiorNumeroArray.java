package Exercicios;

public class MaiorNumeroArray {
    public static void main(String[] args) {

        int[] valores = {3, 7, 2, 9, 5};

        System.out.println(maiorNumero(valores));        
    }
    
    public static int maiorNumero(int[] n) {

       int maior = n[0]; // começa com o primeiro elemento

       // contador, condição de execução, incremento para sair do loop
       for(int i = 1; i < n.length; i++) {
         
        if(n[i] > maior) {
            maior = n[i];
        }

       }

       return maior;

    }

}
