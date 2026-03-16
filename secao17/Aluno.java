package secao17;

public class Aluno {

/*
    > Exercício 2: Classe Aluno com Encapsulamento e Construtores

    Crie uma classe Aluno com as propriedades privadas nome, matricula, notaFinal.
    Adicione um construtor parametrizado para inicializar essas propriedades e 
    implemente os getters e setters com validação para garantir
    que não esteja vazio e a nota final esteja entre 0 e 100.
    Na classe principal, crie dois objetos da Classe aluno, 
    atribua valores e exiba as informações.


 */
   // Propriedades privadas:
    private String nome;
    //private int matricula;
    private double notaFinal;

    // Construtor parametrizado para inicializar com as propriedades
    public Aluno(String nome, int matricula, double notafinal){

        this.nome = nome;
        //this.matricula = matricula;
        this.notaFinal = notafinal;
    }

    // getters
    public String getNome(){
        return nome;
    }

    public Double getNotaFinal(){
        return notaFinal;
    }

    // setters
    public void setNome(String nome){
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    
    }

    public void setNotaFinal(double notaFinal){
        if(notaFinal >= 0 && notaFinal <= 100){
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Nota inválida");
        }

    }

    // Exibir informação
    public void exibirInfo(){
        System.out.println("O aluno: " + nome + ", obteve anota final de: " + notaFinal);
    }


    
}

