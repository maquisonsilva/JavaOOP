package secao17;

public class Exercicio {
    public static void main(String[] args) {
        
    // Exercicio 01
       
        Celular iphone = new Celular();

        iphone.marca = "Apple";
        iphone.modelo = "Iphone 15";

        iphone.ligar();

        iphone.desligar();

        iphone.usar(10);

        Celular sansung = new Celular();

        sansung.marca = "Sansung";
        sansung.modelo = "S10";

        sansung.ligar();
        sansung.desligar();
        sansung.usar(30);

    // Exercicio 02

        Aluno pedro = new Aluno("Pedro", 123, 33.3);

        System.out.println(pedro.getNome());

        System.out.println(pedro.getNotaFinal());

        pedro.setNome("Pedro Alves");

        pedro.setNotaFinal(50.0);

        pedro.exibirInfo();

        Aluno maria = new Aluno("Maria de Araujo Lima", 5423, 98.9);

        maria.exibirInfo();



        // Exercicio 04

        ProdutoEletronico microondas = new ProdutoEletronico("Microondas", 400, 12);

        microondas.aplicarDesconto(15);
        microondas.exibirInfo();
    }
    
}
