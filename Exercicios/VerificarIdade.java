package Exercicios;

public class VerificarIdade {
    public static void main(String[] args) {

        verificarIdade(18);
        verificarIdade(17);
        
    }

    public static void verificarIdade(int n) {

        if(n < 18){
            System.out.println("Acesso negado"); 
            System.exit(0);            

        } else {
            System.out.println("Acesso permitido");
            
        }

    }
    
}
