package Exercicios;

public class LoopCalcularFatorial {
    public static void main(String[] args) {
        
       System.out.println(calcularFatorial(5));
    }

    public static int calcularFatorial(int n) {

        int result = 1;

        for(int i = 1; i <= n; i++) {
            result *= i;                   
        }

        return result;
    }
    
}
