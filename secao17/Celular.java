package secao17;

public class Celular {

   /*
        Exercício 1: Criando uma Classe Celular
        
        Crie uma classe Celular Celular que tenha as seguintes propriedades: marca, modelo, bateria
        Implemente os métodos para ligar e desligar o celular,
        e outro método que simule o consumo da bateria quando o celular é usado.
        Crie a classe principal para instanciar dois objetos Celular
        e testar os métodos criados
    */

    String marca;
    String modelo;
    int bateria = 100;
        
    void ligar(){
        System.out.println("O celular " + modelo + " está ligado.");
    }

    void desligar(){
        System.out.println("O celular " + modelo + " está desligado.");
    }
        

   void usar(int consumo){

        if(bateria - consumo > 0){
            bateria -= consumo;
            System.out.println("Estado atual da bateria: " + bateria + "%");

        } else {
            System.out.println("Celular sem bateria, necessário carregar.");
        }

    }
    
}
