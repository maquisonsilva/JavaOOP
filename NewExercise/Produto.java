package NewExercise;

public class Produto {

    // 01 - Criação dos atributos:
    private String nome;
    private double preco;
    private int quantidade;

    // 02 - Criação do construtor:
    public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    // 03 - Criar o método exibirDetalhes
    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + ", Preço: " + preco + ", quantidade: " + quantidade);
    }

    // 04 -  Criar o método atualizarQuantidades
    public int atualizarQuantidades(int novaQuantidade) {

        quantidade -= novaQuantidade;

        return quantidade;
    }

    // 05 - Criar o método calcularValorEstoque
    public void calcularValorEstoque() {
        System.out.println("Valor total do estoque: " + preco * quantidade);
    }
    
}
