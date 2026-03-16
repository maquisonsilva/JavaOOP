package secao8;

import java.util.Arrays;
import java.util.List;

public class FuncaoAnonima {
    public static void main(String[] args) {
        
        // função anonima (lambda)
        // (arg1, arg2) -> {}

        Runnable  tarefa = () -> System.out.println("Minha função anônima!");

        tarefa.run();

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");

        nomes.forEach(nome -> System.out.println(nome));
        
    }
    
}
