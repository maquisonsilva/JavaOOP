package secao4;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // 8 - Operadores Lógicos

        // && (E lógico): Retorna true se ambas as condições forem verdadeiras;
        // || (OU lógico): Retorna true se pelo menos uma das condições for verdadeira;
        // ! (NÂO lógico): Inverte o valor lógico; retorna true se a condição for falsa e vice-versa;
        // (Combinações): Pode combinar múltiplas condições em uma única expressão lógica;
        // (&& - Curto-circuito): Se a primeira condição for false, a segunda condição não é avaliada;
        // (|| - Curto-circuito): Se a primeira condição for true, a segunda condição não é avaliada; 

        // Tabela verdade:
        //---- AND -----
        // A | B | A_B      
        // 0 | 0 |  0
        // 0 | 1 |  0
        // 1 | 0 |  0
        // 1 | 1 |  1
        //--------------
        //----- OR -----
        // A | B | A_B      
        // 0 | 0 |  0
        // 0 | 1 |  1
        // 1 | 0 |  1
        // 1 | 1 |  1
        //---------------
        //----- NOT -----
        // A | Ä        
        // 0 | 1 
        // 1 | 0 
        //---------------

        //  (&&) AND lógico

        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        // true == true > true (variável)
        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        // true && true => true
        if(a > 5 && b > 10){
          System.out.println("Deu certo!"); 
        }

        // false && true => (curto circuito)
        if(a > 55 && b > 10){
          System.out.println("Deu certo2!"); 
        }

        //  (||) OR lógico

        boolean estaChuvendo = true;
        boolean temGuardaChuva = true;

        System.out.println(estaChuvendo || temGuardaChuva);

        System.out.println(false || false);

        System.out.println(10 > 20 || 100 == 200);

        int idade2 = 6;
        boolean ehMembro = false;

        // O usuário pode participar do clube
        // ele precisa ter > 16 anos OU se membro

        if (idade2 > 16 || ehMembro) {
          System.out.println("Você pode entrar");
        } else {
          System.out.println("Entrada negada!");
        }

        //  (!) NOT lógico

        System.out.println(estaChuvendo);
        System.out.println(!estaChuvendo);

        System.out.println(estaChuvendo || !temGuardaChuva);

        System.out.println(!(estaChuvendo || !temGuardaChuva));
        
    }
    
}
