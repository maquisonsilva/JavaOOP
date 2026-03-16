package Exercicios;

public class Fibonacci {
    public static void main(String[] args) {
    
       System.out.println(gerarFibonacci(10)); 

    }

    public static int[] gerarFibonacci(int n) {
       
        int[] resultado = new int[n];

        if(n == 0) {

            return resultado;
        }
       
        int a = 0;
        int b = 1;
        int i = 0;
                
        while (i < n) {

            resultado[i] = a;

            int prox = a + b;
            a = b;
            b = prox;            
         i++;        
        }

        return resultado;
       
    }
    
}
