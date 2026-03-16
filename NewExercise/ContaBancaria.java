package NewExercise;

public class ContaBancaria {

    String numeroConta;
    double saldo;

    public ContaBancaria(String numeroConta, double saldo) {

        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double depositar(double valor) {

        saldo += valor;
        return saldo;
        
    }

    public double sacar(double valor) {

       if(valor <= saldo && valor > 0) {

        saldo -= valor;

       }           
        
        return saldo;
        
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }
    
}
