package secao5;

public class CondicionaisDois {
    public static void main(String[] args) {
        
        // 1 - Condicinal ternário
        int n = 10;

        String resultado = (n % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(resultado);

        // CONDIÇÃO X > 5 ? EXPRESSÃO SE É TRUE "Ok" : EXPRESSÃO SE É FALSE "Não Ok"

        // 2 - If encadeado
        int idade = 25;
        boolean temCarteira = true;

        if(idade >= 18) {

            if(temCarteira){
                System.out.println("Pode dirigir!");
            } else {
                System.out.println("Precisa ter habilitação para dirigir!");
            }

        } else {
            System.out.println("Você não pode dirigir ainda!");
        }

        // 3 - Preceddência
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // TRUE AND FALSE -> FALSE OR TRUE -> TRUE
        Boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        // TRUE OR FALSE -> TRUE AND TRUE -> TRUE
        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        // NOT (TRUE OR FALSE) -> NOT(TRUE) -> FALSE AND TRUE -> FALSE
        boolean resultado4 = !(a || b) && c;

        System.out.println(resultado4);

        
        boolean resultado5 = (!a || b) && c;

        // (NOT TRUE OR FALSE) AND TRUE
        // (FALSE OR FALSE) AND TRUE
        // FALSE AND TRUE
        // FALSE    
        System.out.println(resultado5);

    }
    
}
