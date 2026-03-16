package AvançadoPOO18;

public class Violino extends InstrumentoMusical {

    public Violino(String nome) {
        super(nome);
    }
    
    @Override
    public void tocar() {
        System.out.println("Agora estou tocando o " + nome);
    }
}
