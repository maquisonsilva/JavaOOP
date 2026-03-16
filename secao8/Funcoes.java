package secao8;

public class Funcoes {
    public static void main(String[] args) {

       // 1 - Criando a primeira função
        saudacao();

        // 2 - parâmetros
        soma(5, 9);
        soma(7, 4);

        saudar("Maquison");

        // 3 - retorno (return)

        dobrar(4);

       //-------------------1
      
       int numero = 10;
      
       //--------------------2
      
       int nDobrado = dobrar(numero);
       System.out.println("O número dobrado é " + nDobrado);
      
       //-------------------3 
      
       System.out.println(dobrar(12));

       // 4 - retorno em variável

       String r1 = vPar(numero);

       String r2 = vPar(3);

       System.out.println(r1);
       System.out.println(r2);

       int x = dobrar(soma2(2,4));
       System.out.println(x);


    }
        
    // Nivel de acesso: 
    // (static) não preciso instanciar classe para executar
    // (void) tipo de retorno


    // Nome, os parenteses (args), BLOCO {}
    public static void saudacao() {
        System.out.println("Olá, esta é minha primeira função!");
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }

    public static void saudar(String nome) {
        System.out.println("Olá, " + nome + ", tudo bem?");
    }

    // Parametros de funções diferentes podem ter o mesmo nome    
    public static int dobrar(int n) {
        return n * 2;
    }


    public static String vPar(int n) {
        if(n % 2 == 0) {
           return "O número " + n + " é par"; 
        } else {
           return "O número " + n + " não é par"; 
        }
    }

    public static int soma2(int a, int b) {
        return a + b;
    }
    
}
