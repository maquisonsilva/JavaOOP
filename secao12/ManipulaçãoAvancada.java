package secao12;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class ManipulaçãoAvancada {
public static void main(String[] args) {
    // Manipulção Avançada

    // Cópia
    int[] original = {1, 2, 2, 3};

    int[] copia = Arrays.copyOf(original, 3);

    System.out.println(Arrays.toString(copia));    

    // fill - preenchimento de arrays
    int[] numeros = new int[5];

    System.out.println(Arrays.toString(numeros));

    Arrays.fill(numeros, 5);
    System.out.println(Arrays.toString(numeros));

    // Transformação de array para stream
    int[] values = {1, 2, 3, 4, 5};

    // fazer a soma dos elementos

    int sum = Arrays.stream(values).sum();
    System.out.println(sum);

}
    
}
