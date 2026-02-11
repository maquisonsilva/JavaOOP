package secao11;

public class EncontrarMaiorNumero {
    public static void main(String[] args) {   

        int[] numeros = {1, 2, 7, 8, 22, 20, 14};
        
       System.out.println(encontrarMaiorNumero(numeros));

    }

    public static int encontrarMaiorNumero(int[] n){

        int maiorNumero = 0;

        for(int i = 0; i < n.length; i++){

            if( maiorNumero < n[i]){

                maiorNumero = n[i];

            }

        }
        return maiorNumero;

       } 
    
}
