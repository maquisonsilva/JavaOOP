package Exercicios;
import java.util.Arrays;

public class ex126_01_InverterArray {
    public static void main(String[] args) {
        
        int[] arrOriginal = {1, 2, 3, 4, 5};
        int[] arrInvertido = new int[arrOriginal.length];

        for(int i = 0; i < arrOriginal.length; i++) {

          arrInvertido[i] = arrOriginal[arrOriginal.length - 1 - i];  
            
        }

        System.out.println(Arrays.toString(arrOriginal));
        System.out.println(Arrays.toString(arrInvertido));

    }
    
}
