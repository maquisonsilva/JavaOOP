package secao12;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class AvancandoArrays {
public static void main(String[] args) {
    
// 1 - Ordenação
// Ordenação de arrays inteiros
int[] numbers = {5, 6, 1, 4, 2, 22, 1};

// Modifica o array original
Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));

// Ordenação com Comparator
String[] names = {"João", "Bob", "Pedro", "Marco"};

Arrays.sort(names);
System.out.println(Arrays.toString(names));

Arrays.sort(names, Comparator.reverseOrder());
System.out.println(Arrays.toString(names));

// Ordenação com matriz
int [][] matriz = {
    {4, 5, 1},
    {3, 8, 9},
    {2, 3, 1}
};

// Ordenação de linhas por valor de coluna
Arrays.sort(matriz, Comparator.comparingInt(a -> a[0]));

for(int[] linha : matriz){
    System.out.println(Arrays.toString(linha));
}

// Imprimir matriz sem o foreach
System.out.println(Arrays.deepToString(matriz));


} 

}
