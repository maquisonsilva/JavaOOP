package AvançadoPOO18;

public class Cachorro extends Animal {

    // A classe Cachorro é obrigada a utilizar as propriedades da classe pai (Animal) - "super"
    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(nome + " está latindo!");
    }

    
}
