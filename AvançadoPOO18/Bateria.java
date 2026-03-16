package AvançadoPOO18;

public class Bateria extends InstrumentoMusical {

     public Bateria(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando os tambores da " + nome);
    }
    
}
