package secao4;

public class Condicionais {
    public static void main(String[] args) {
        
        // Comparação de strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str1);

        System.out.println(str1 == str2);

        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str1.equals("Java"));

        String str3 = "JAVA";

        System.out.println(str1.equals(str3));

        // Java == JAVA (false) > Java == Java
        System.out.println(str1.equalsIgnoreCase(str3));

        // 5 - if

        int n = 10;

        if (n > 5) {
            System.out.println("O número é maior que 5");
        }

        // if com strings

        String t = "Teste";

        // Se a função retorna um booleano, eu posso usar no if
        if(t.equals("Teste")) {
            System.out.println("O texto é: Teste");
        }
        // Declaração do if (comparação ou retorno de boleano) { o que será executado... }


        // 6 - else

        int q = 7;

        if(q > 10) {
            System.out.println("Q é maior q 10");
        } else {
            System.out.println("Insira um número maior que 10!");
        }
        // todo else precisa ter um if, mas nem todo if precisa ter um else

          if(t.equals("Teste2")) {
            System.out.println("O texto é: Teste");
        } else {
            System.out.println("O texto não é igual!");
        }   

        // 7 - else if

        double nota = 8.5;

        if(nota == 10) {
            System.out.println("VocÊ tirou a nota máxima, parabéns!");
        } else if(nota >= 9) {
            System.out.println("Nota muito boa!");
        } else if(nota >= 7) {
            System.out.println("Nota acima da média");
        } else {
            System.out.println("Nota abaixo da média");
        }

        int num = 5;

        if(num > 3 && num < 5) {
            System.out.println("Alguma coisa");
        } else if(num == 5) {
            System.out.println("Outra coisa aqui!");
        }

        // 1 - vou escolher qual a situação que eu quero que mais ocorra
        // 2 - melhorar a lógica, deixo a comparação mais especifica

        
    }    
}
