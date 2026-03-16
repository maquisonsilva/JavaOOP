package secao12;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class MatrizDinamica {
    public static void main(String[] args) {

        // Arrays dinâmicos
        ArrayList<String> frutas = new ArrayList<>();
        System.out.println(frutas);

        frutas.add("Maçã");
        frutas.add("Banana");
        System.out.println(frutas);

        for(String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.remove("Banana");
        System.out.println(frutas);

        frutas.remove(0);
        System.out.println(frutas);

         frutas.add("Maçã");

         String frutaEspecifica = frutas.get(0);

         System.out.println(frutaEspecifica);

         // Não funciona com indide diretamente, tem que ser o get
         //System.out.println(frutas[0]);
        
    }
    
}
