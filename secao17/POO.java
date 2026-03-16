package secao17;

public class POO {
    public static void main(String[] args) {
        // 1 - Criar a classe
        // criação de Carro.java

        // 2 - Instanciar a classe
        Carro fusca = new Carro();

        // Acessar as propriedades e métodos sintaxe;
        // NOMEOBJETO.PROPRIEDADE e NOMEOBJETO.METODOS()

        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;

        fusca.acelerar();
        fusca.exibirInfo();

        Carro argo = new Carro();

        argo.marca = "Fiat";
        argo.modelo = "Argo";
        argo.ano = 2006;

        argo.acelerar();
        argo.exibirInfo();

        System.out.println(fusca == argo);

        // 3 - métodos

        fusca.aumentarVelocidade(10.0);

        fusca.ligarMotor();

        fusca.aumentarVelocidade(20.0);

        fusca.aumentarVelocidade(30.0);

        System.out.println(fusca.motorLigado);

        // 4 - Criando propriedades
        Pessoa joao = new Pessoa();

        // PROTEGIDO: joao.nome = "João";
        joao.setNome("João");

        System.out.println("O nome do João é: " + joao.getNome());

        // PROTEGIDO: joao.idade = 42;
        joao.setIdade(42);

        System.out.println("A idade do João é: " + joao.getIdade());

        ContaBancaria contaDaAna = new ContaBancaria();

        contaDaAna.setTitular("Ana");

        System.out.println("O nome do titular é: " + contaDaAna.getTitular());

        contaDaAna.setSaldo(1000);

        System.out.println("O saldo da " + contaDaAna.getTitular() + " é de " + contaDaAna.getSaldo());

        // 6 - Lógica em get e set

        Produto camisa = new Produto();

        camisa.setNome("Camisa Regata");
        System.out.println(camisa.getNome());

        camisa.getPreco(59.455509);
        System.out.println(camisa.getPreco());


        Livro meuLivro = new Livro("Harry Potter", "J K Rowlling", 31.90);

        meuLivro.exibirInfo();

        Livro meuLivro2 = new Livro();

        meuLivro2.exibirInfo();
        
    }
    
}
