package AvançadoPOO18;

interface Calculadora {

    // tem que ser implementado
    int somar(int a, int b);
    
    // Pode ser utilizado sem implementação
    default int multiplicar(int a, int b) {
        return a * b;
    }
    
}
