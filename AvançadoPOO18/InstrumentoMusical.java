package AvançadoPOO18;

abstract class InstrumentoMusical {

    protected String nome;

    public InstrumentoMusical(String nome) {

        this.nome = nome;
    }

    // Abstrato: tem que ser implementado na subclase.
    public abstract void tocar();

    // Concreto: pode ser herdado.
    public void exibirDetalhes() {
        System.out.println("Instrumento: " + nome);
    }
    
}
