package Exercicios;

public class NumerosPrimos {
    public static void main(String[] args) {
        
        int numPrimo = 11;
        boolean ePrimo = true;

        for(int i = 2; i < numPrimo; i++) {
            if(numPrimo % i == 0) {
                ePrimo = false;
                break;
              }   
             
        } 

        if(ePrimo) {
            System.out.println("O número " + numPrimo + " é primo!");
        } else {
            System.out.println("O número " + numPrimo + " NÂO é primo!");
        }


        // Exercio 04:  do while
        int opcao;

        do {
            System.out.println("Exercício 4 - Menu");
            System.out.println("0) Refigerante");
            System.out.println("1) Hamburguer");
            System.out.println("2) Cachoro Quante");
            System.out.println("3) Sushi");
            System.out.println("4) Sair");

            opcao = (int)(Math.random() * 5);
            
            System.out.println("A opção escolhida foi: " + opcao);

        } while (opcao != 4);

        
    }
    
}
