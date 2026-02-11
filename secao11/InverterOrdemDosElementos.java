package secao11;

import java.util.Arrays;

public class InverterOrdemDosElementos {

    public static void main(String[] args) {
        int[] inverter = {1, 2, 3, 4};

        int[] resultado = inverterOrdemDosElementos(inverter);

        System.out.println(Arrays.toString(resultado));

    }

    public static int[] inverterOrdemDosElementos(int[] n){

            for(int i = 0; i < n.length / 2; i++){
                int temp = n[i];
                n[i] = n[n.length - 1 - i];
                n[n.length - 1 - i] = temp;                
            }

        return n;
    }
    
}
