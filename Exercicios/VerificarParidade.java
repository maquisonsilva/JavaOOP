package Exercicios;

public class VerificarParidade {

    public static void main(String[] args) {

        System.out.println(verificaParidade(5));
        System.out.println(verificaParidade(6));
        
    }

    public static String verificaParidade(int n) {

       if(n % 2 == 0) {

        return "O número " + n + " é par"; 

        } else {

        return "O número " + n + " é ímpar";    

        }

    }
    
}
