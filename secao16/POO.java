package secao16;

public class POO {
public static void main(String[] args) {
 // 1 - Criar classe
 // Criação do Carro.java

 // 2 - Instânciar a classe
 Carro fusca = new Carro();

 // Acessar propriedades e métodos sintaxe:
 // NOMEOBJETO.PROPRIEDADE e NOMEOBJETO.METODO() 
 fusca.marca = "VW";
 fusca.modelo = "Fusca";
 fusca.ano = 1964;

 fusca.acelerar();
 fusca.exibirInfo();

 Carro carro2 = new Carro();

 carro2.marca = "Fiat";

}   
}
