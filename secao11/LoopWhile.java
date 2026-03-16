package secao11;

public class LoopWhile {
    public static void main(String[] args) {
        
        // while

        int i = 1;

        while (i <= 5) {
            
            System.out.println("While contador: " + i);

            i++;
        }

        int valor = 0;
        int k = 1;
        while (valor != 7) {
            
            valor = (int)(Math.random() * 10);

            System.out.println(k + " Valor aleatório: " + valor);
            k++;
        }



    }
    
}
