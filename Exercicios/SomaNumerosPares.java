package Exercicios;

public class SomaNumerosPares {
   public static void main(String[] args) {
        
       System.out.println(somarNumerosPares(1, 10)); 

    }

    public static int somarNumerosPares(int n1, int n2) {
        int resultado = 0;
        for(int i = n1; i <= n2; i++) {

           if( i % 2 == 0 ) {
            
            resultado += i;

           }

        } 
        
        return resultado;
         
    }
    
}
