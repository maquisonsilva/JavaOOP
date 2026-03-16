package AvançadoPOO18;

public class Quadrado extends Forma {
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Sobrescrita => respeita retorno, nome e argumento do método:
    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }


}
