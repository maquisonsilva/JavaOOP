package secao12;

public class Listas {
    public static void main(String[] args) {

        // 1 - sintax
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        // {elem1, elem2, elemx....}

        System.out.println("Acessando promeiro elemento do array: " + numeros[0]);

        // Tamanho fixo, só que vazio
        String[] frutas = new String[3];

        // 0, 1, e 2 -> add elementos
        // 3 -> não tem
        
        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";

        System.out.println("Acessando os elementos do array: " + frutas[0] + ", " + frutas[1] + ", " + frutas[2] );


        double[] precos = {1.99, 2.45, 4.97};

        System.out.println(precos[0]);
    }
    
}
