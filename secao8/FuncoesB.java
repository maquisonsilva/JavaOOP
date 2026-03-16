package secao8;

public class FuncoesB {

    // Escopo Global
    static int globalVar = 20;

    public static void main(String[] args) {
        
        // 5 - funções com condicionais
        String r1 = verificarAcesso(17,true, false);
        System.out.println(r1);
        String r2 = verificarAcesso(18,false, false);
        System.out.println(r2);
        String r3 = verificarAcesso(18,true, true);
        System.out.println(r3);
        String r4 = verificarAcesso(18,true, false);
        System.out.println(r4);

        // 6 - Função com switch
        System.out.println(obterDiaDaSemana(2));

        // 7 - System exit
        verificarAutenticacao("admin", "SenhaSegura");

        System.out.println("Oi!");

        // 8 - Documentação função
        System.out.println(calculaMedia(5, 6, 7));

        // 9 - Escopo Local
        int localVar = 10;

        if(true) {
            System.out.println(localVar);
        }

        System.out.println(globalVar);

        escopoLocal(localVar);

        int testeFnEscopo = escopoLocal(localVar);

        System.out.println(testeFnEscopo);

        // { } -> geralmente delimitem um escopo, cria um escopo


    }

    public static String verificarAcesso(int idade, boolean temCNH, boolean temHistoricoNegativo) {
    
        if(idade >= 18 && temCNH && !temHistoricoNegativo) {
            return "Acesso permitido: todos os critérios atendidos!";
        } else if(idade >= 18 && temCNH && temHistoricoNegativo) {
            return "Acesso negado: Histórico negativo detectado!";
        } else {
            return "Acesso negado: Critérios não atendidos!";
        }

    }

    public static String obterDiaDaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";        
            default:
                return "Dia inválido";
        }
    }

    public static void verificarAutenticacao(String usuario, String senha) {

        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida!");

    }

    /**
     * 
     * Calcula a média de três números inteiros
     * 
     * @param num1 O primeiro número/nota a ser enviado
     * @param num2 O segundo número/nota a ser enviado
     * @param num3 O terceiro número/nota a ser enviado
     * @return A média dos três números
     * 
     */
    
    public static double calculaMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static int escopoLocal(int a) {
        System.out.println(globalVar);
        System.out.println(a);

        int testFuncao = 1;

        return testFuncao;
    }
    
}
