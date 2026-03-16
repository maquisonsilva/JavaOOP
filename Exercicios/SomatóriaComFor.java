package Exercicios;

//Exercicio 01: Somatória com for.
public class SomatóriaComFor {
    public static void main(String[] args) {

        long resultado = 0;
        
        for(int i = 1; i <= 100; i++) {
            resultado += i;           
        }

         System.out.println("Soma de 1 á 100: " + resultado);         
      
    }
    
}
