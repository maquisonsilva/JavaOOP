package secao4;
import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        
        // Ex: 01
       Scanner scanner = new Scanner(System.in);
        /* System.out.println("Digite o preço do produto ");
        double vProduto = scanner.nextInt();

        if(vProduto < 50){
            System.out.println("Barato");
        } else if(vProduto >= 50 && vProduto <= 100){
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }

        // Ex: 02

        System.out.println("Digite o seu usuário: ");
        String user = scanner.next();
        //user = scanner.next();

        System.out.println("Digite sua senha: ");
        String pws = scanner.next();

        if(user.equals("admin")  && pws.equals("1234")){
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

            
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        String resultado = "";

        if(num % 2 == 0){
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }
        System.out.println("O núnero " + num + " é " + resultado);

        // Ex: 04

        System.out.println("Digite um número de 1 à 7: ");
        int dSemana = scanner.nextInt();
        String rSemana = "";

        switch (dSemana) {
            case 1:
            case 7:
                rSemana = "Final de Semana";                
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                rSemana = "Dia de semana";
                break;    
            default:
                rSemana = "Número inválido";                
                break;
        }
        System.out.println(rSemana);

        // Ex: 05

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        if(num1 >= 10 && num1 <= 20){
            System.out.println("Dentro do intervalo.");
        } else {
            System.out.println("Fora do intervalo.");
        } 

        // Ex: 06

        System.out.println("Digite um letra: ");
        String letra = scanner.next();
        String lResult = "";

        if(letra.equals("a")  || letra.equals("A")){
            lResult = "é uma vogal";
        } else if(letra.equals("e")  || letra.equals("E")){
            lResult = "é uma vogal";
        } else if(letra.equals("i")  || letra.equals("I")){
            lResult = "é uma vogal";
        } else if(letra.equals("o")  || letra.equals("O")){
            lResult = "é uma vogal";
        } else if(letra.equals("u")  || letra.equals("U")){
            lResult = "é uma vogal";
        } else {
            lResult = "é uma consoante";
        }
        System.out.println(lResult);*/

        // Solução utilizando switch

        System.out.println("Digite uma letra: ");
        char newLeter = scanner.next().toLowerCase().charAt(0);

        switch (newLeter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;        
            default:
                System.out.println("Consoante");
                break;
        }
        
        scanner.close();
    }
}
