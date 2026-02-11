package secao11;

public class LoopFor {
    public static void main(String[] args) {
        
        // 1 - for

        // loop que vai rodar de 1 a 5

        // variavel de inicialização = i, j, k
        // condição -> determina até quando ou quantas vezes, o loop vai rodar
        // incremento -> a variável vai chegar na condição

        for (int i = 1; i <= 5; i++) {
            // repetir
            System.out.println(i);
        }


        // mostrar cada caracter de uma string

        String texto = "Maquison";

        for(int i = 0;i < texto.length(); i++) {
            System.out.println("Caractere: " + texto.charAt(i));
        }

        // Contagem regressiva

        for(int i = 5; i > 0; i--){
            System.out.println("Contador: " + i);
        }

    }
    
}
