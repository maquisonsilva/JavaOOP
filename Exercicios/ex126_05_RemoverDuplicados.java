package Exercicios;
import java.util.Arrays;
import java.util.ArrayList;


public class ex126_05_RemoverDuplicados {
    public static void main(String[] args) {
        
        int[] matrizComDuplicados = {1, 1, 2, 2, 3, 4, 5, 5};

        // Array numerico sem quantidade de elementos definidos    
        ArrayList<Integer> matrizSemDuplicados = new ArrayList<>();

        for(int numero : matrizComDuplicados){

            if(!matrizSemDuplicados.contains(numero)){
                matrizSemDuplicados.add(numero);
            }

        }

        System.out.println(Arrays.toString(matrizComDuplicados));
        System.out.println(matrizSemDuplicados);

    }
    
}
