package Exercicios;
import java.util.Scanner;
import java.lang.Character;

public class ex133_JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavraSecreta = "Batata";
        String[] palavraOculta = {"_", "_", "_", "_", "_","_"};
        int tentativas = 3;
        
        for(int i = 1; i <= tentativas; i++){

            System.out.println("\nPalavra: ");
            for(String letra : palavraOculta){
                System.out.println(letra + " ");
            } 

            System.out.println("\nDigite uma letra. Tentativa " + i + ":");
            String entrada = scanner.nextLine();
            char letraDigitida = entrada.charAt(0);

            boolean acertou = false;

            // percorre a palavra secreta
            for(int j = 0; j < palavraSecreta.length(); j++){

                if(Character.toLowerCase(palavraSecreta.charAt(j)) == Character.toLowerCase(letraDigitida)){

                    palavraOculta[j] = String.valueOf(palavraSecreta.charAt(j));
                    acertou = true;

                }

            }

            if(acertou){
                System.out.println("Acertou uma letra!");
            } else {
                System.out.println("Essa letra não existe.");
            }

        }      
            scanner.close();
        }
        
    }
    

