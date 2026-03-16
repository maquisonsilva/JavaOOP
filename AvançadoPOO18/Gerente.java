package AvançadoPOO18;

public class Gerente extends Funcionario {

    private double bonusAdicional;

    public Gerente(String name, double salario, double bonusAdicional) {
        super(name, salario);

        this.bonusAdicional = bonusAdicional;
    }

    @Override
    public double calcularBonus() {
        return super.calcularBonus() + bonusAdicional;
    }

    @Override 
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bonus adicional de: " + bonusAdicional);
    }

}