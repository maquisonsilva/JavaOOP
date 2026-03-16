package secao17;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void setTitular(String titular){

        // Lógica para validar ou manipular
        if(titular != null && !titular.isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("Nome do titular invalido.");
        }
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){

        if(saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("O valor do saldo precisa ser possitivo.");
        }
    }

    public String getSaldo(){
        return "R$" + saldo;
    }
    
}
