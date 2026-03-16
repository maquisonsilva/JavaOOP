package Exercicios;

public class NumeroParOuImpar {
    public static void main(String[] args) {
        System.out.println(numeroParImpar(10));
    }

    public static String numeroParImpar(int numero) {

        if(numero % 2 == 0) {
            return "Número Par";
        } else {
            return "Número Ímpar";
        }
    }
    
}
