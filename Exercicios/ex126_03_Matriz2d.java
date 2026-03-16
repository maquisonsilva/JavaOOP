package Exercicios;
import java.util.Arrays;

public class ex126_03_Matriz2d {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];

       for(int[] linha : matrizTransposta){
        System.out.println(Arrays.toString(linha));
       }

       for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[0].length; j++){
            matrizTransposta[j][i] = matriz[i][j];            
            //System.out.println(i);
            //System.out.println(j);
        }
       }

      for(int[] linha : matrizTransposta){
        System.out.println(Arrays.toString(linha));
       }  

    }
    
}
