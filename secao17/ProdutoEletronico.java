package secao17;

public class ProdutoEletronico {
    /*
        > Exercício 4: Classe de ProdutoEletronico com Método dentro de Método

        Crie uma classe ProdutoEletronico com as propriedades nome, preco, e garantia.
        Implemente um método para aplicar desconto no preço e, dentro deste método,
        chame outro método que calcula valor do desconto.
        Crie um objeto da classe ProdutoEletronico, aplique o desconto
        e exiba as informações após a alteração do preço.    
    */

        private String nome;
        private double preco;
        private int garantia;

        // Criando o construtor:
        public ProdutoEletronico(String nome, double preco, int garantia) {
            this.nome = nome;
            this.preco = preco;
            this.garantia = garantia;
        }

        // Criando o método
        public void aplicarDesconto(double porcentagem) {

            if(porcentagem > 0 && porcentagem <= 100) {

                double valorDesconto = calcularDesconto(porcentagem);

                preco -= valorDesconto;

                System.out.println("Desconto aplicado, o preço agora é: " + preco);

            } else {
                System.out.println("Porcentagem incorreta.");
            }
        }

        // Método para aplicar o desconto:
        public double calcularDesconto(double porcentagem) {
            return (preco * porcentagem) / 100;
        }

        public void exibirInfo() {
            System.out.println("O produto: " + nome + ", está com o preço de: " + preco + ", e tem " + garantia + " meses de garantia.");
        }
    
}
