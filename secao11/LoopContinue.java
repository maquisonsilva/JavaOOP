package secao11;

public class LoopContinue {
    public static void main(String[] args) {
        
        for(int x = 10; x > 0; x--) {

            if(x % 2 == 0) {

                System.out.println("par!");
                continue;

            }

            System.out.println("Contador: " + x);

        }

    }
    
}
