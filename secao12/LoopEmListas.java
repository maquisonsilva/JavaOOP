package secao12;

public class LoopEmListas {
    public static void main(String[] args) {

        // 1 - sintaxe
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};


         String[] frutas = new String[3];

        // 0, 1, e 2 -> add elementos
        // 3 -> não tem
        
        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";

        // Somar todos o elementos de um array
        // acessar os elementos e condensar a soma deles em uma variável.
        int soma = 0;

        for(int i = 0; i < numeros.length; i++) {

            soma += numeros[i];
            
        }

        System.out.println("Soma dos elementos: " + soma);


        // for each
        // Nomear o item -> Array
        // Pessoas -> Pessoa
        // Frutas -> Fruta
        for(String fruta : frutas) {

            System.out.println("A fruta da vez é: " + fruta);

        }

        // encontrar o maior valor de um array
        int[] valores = {10, 25, 8, 22, 1};

        int maiorValor = valores[0];

        int j = 0;

        while (j < valores.length) {
            
            if(valores[j] > maiorValor) {
                maiorValor = valores[j];
            }
            j++;
        }

        System.out.println("O maior valor é: " + maiorValor);

        // for each
        for(int numero : numeros) {
            System.out.println("O numero é: " + numero);
        }

        // Concatenar palavras

        String[] palavras = {"Java" , "é", "bom!"};

        String frase = "";

        for(String palavra : palavras) {
            frase += palavra + " ";
        }

        System.out.println(frase);

        // varificar se valor esta presente em array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'i';

        for(char letra : letras) {

            if(letra == letraProcurada){

                System.out.println("Encontramos a letra: " + letra);
                break;
            }
            
        }        
                
    }
    
}
