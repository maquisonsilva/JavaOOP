package exercicioPOO18;

public class Pessoa {

    private String nome;
    private int idade;
    //
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {

            this.nome = nome;
            this.idade = idade;
            // Propriedade de object composition
            this.endereco = endereco;

    }

    public void exibirInformacoes() {

        System.out.println("Nome: " + nome + ", idadade: " + idade);
        System.out.println("Endereço: " + endereco.getEnderecoCompleto());

    }


    
}
