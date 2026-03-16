package exercicioPOO18;

public class Exercicio1 {

    public static void main(String[] args) {

    /*
        > Exercício 1: Composição de Objetos (Object Conposition)
        
        Enunciado: Crie uma classe Endereco que tenha os atributos rua, numero e cidade.
        Agora, crie uma classe Pessoa que tenha atributos como nome, idade 
        e um atributo de composição endereço, que seja do tipo Endereco.
        Implemente um método exibir informaçoes() em Pessoa que exiba os dados da pessoa e o seu endereço completo.
    */

        
        Endereco endereco = new Endereco("Timenosso de Cada Dia", 35, "Jaguary");

        Pessoa pessoa = new Pessoa("Frangolino", 23, endereco);

        
        pessoa.exibirInformacoes();

    }
    

}
