package Exercicios;
import java.util.Arrays;

public class ex126_04_SubstituirValores {
    public static void main(String[] args) {
        int[] matrizComNegativos = {1, -2, 3, -4, 5, -6}; 

        System.out.println(Arrays.toString(matrizComNegativos));

        for(int i = 0; i < matrizComNegativos.length; i++){

            if(matrizComNegativos[i] < 0){
                matrizComNegativos[i] = 0;
            }

        }
        System.out.println(Arrays.toString(matrizComNegativos));

    }
    
}
