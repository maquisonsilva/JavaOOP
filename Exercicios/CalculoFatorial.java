package Exercicios;

public class CalculoFatorial {
    public static void main(String[] args) {
        
        int nFatorado = 9;

        System.out.println(calcularFatorial(nFatorado));

    }

    public static long calcularFatorial(int n) {

        long resultado = 1;

        for(int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;

    }
    
}
