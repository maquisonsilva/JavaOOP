package secao11;

public class DoWhile {
    public static void main(String[] args) {
        
        int j = 10;

        do {
            System.out.println("O valor de j é: " + j);

            j--;
        } while (j > 0);


        int numero = 0;

        do {
            
            numero = (int)(Math.random() * 10);
            System.out.println("numero aleatório: " + numero);

            
        } while (numero != 1);


        // break
        // O break pode ser utilizado em qualquer estrutura de loop

        for(int x = 0; x <= 10; x++) {
                System.out.println("O valor de x é: " + x);
            if(x == 5) {
                System.out.println("Parando o loop!");
                break;
            }
        }


    }
    
}
