package Exercise01;
import java.util.Scanner;

public class S11_JogoDaForca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definir a palavra a ser adivinhada
        String palavraSecreta = "JAVA";

        char[] palavraOculta = new char[palavraSecreta.length()];
        
        for(int i = 0; i < palavraSecreta.length(); i++){
            palavraOculta[i] = '_';
        }

        //System.out.println(Arrays.toString(palavraOculta));

        // número máximo de tentativa
        int tentativas = 5;
        boolean venceu = false;

        // Loop que solicita as letras para o usuário
        while(tentativas > 0){
            System.out.println("Palavra: " + String.valueOf(palavraOculta)); 
            System.out.println("Tentativa restantes: " + tentativas);
            System.out.println("Digite uma letra: ");

            char letra = scanner.next().toUpperCase().charAt(0);

            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i++){

                if(palavraSecreta.charAt(i) == letra){
                    palavraOculta[i] = letra;
                    acertou = true;
                }

            }

            // Dedução de tentativas:
            if(!acertou){
                tentativas--;
                System.out.println("Letra incorreta.");
            } else {
                System.out.println("Letra correta.");
            } 
            System.out.println("Teste: " + String.valueOf(palavraOculta));

            if(String.valueOf(palavraOculta).equals(palavraSecreta)){
                venceu = true;
                break;
            }            
        }

        // A condição de vitória
        if(venceu){
            System.out.println("Parabéns, você venceu! Ainda restavam " + tentativas + " tentativas.");            
        } else {
            System.out.println("Você perdeu");            
        }

        System.out.println("A palavra secreta era: " + palavraSecreta);
        scanner.close();
    }
    
}
