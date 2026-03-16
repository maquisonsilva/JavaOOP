package secao12;
import java.util.Arrays;
import java.util.ArrayList;

public class AdicionandoNovosItens {
    public static void main(String[] args) {
        
        // Exemplo 01: Criando um novo array maior e copiando os elementos
        int[] numerosAntigo = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] numerosNovo = new int[numerosAntigo.length + 1];

        for(int i = 0; i < numerosAntigo.length; i++) {
            numerosNovo[i] = numerosAntigo[i];
        }
        System.out.println(Arrays.toString(numerosAntigo));
        System.out.println(Arrays.toString(numerosNovo));

        numerosNovo[numerosNovo.length - 1] = 4;
        System.out.println(Arrays.toString(numerosNovo));

        // Exemplo 02: utilizando arraycopy para copiar os elementos.
        String[] oldFrutas = {"Maçã", "Banana", "Mamão"};

        String[] newFrutas = new String[oldFrutas.length + 1];

        System.arraycopy(oldFrutas, 0, newFrutas, 0, oldFrutas.length);

        newFrutas[newFrutas.length - 1] = "Jaca";

        System.out.println(Arrays.toString(newFrutas));

        // Exemplo 03: utilizando ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Laranja"));

        System.out.println(listaFrutas);

        listaFrutas.add("Manga");

        System.out.println(listaFrutas);

        // Reference trap
        int[] arrayOriginal = {1, 2, 3};
        // programou bastante coisa...
        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;
        System.out.println(Arrays.toString(arrayOriginal));

        // como evitar o Reference trap
        int[] arrayClone = arrayOriginal.clone();

        arrayClone[0] = 99;
        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));

    }
    
}
