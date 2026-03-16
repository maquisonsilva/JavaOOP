package secao12;
import java.util.Arrays;

public class RepeticaoComIf {
public static void main(String[] args) {
    
    // Loops com if

    // filtrar e somar números pares
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    int somaPares = 0;

    for(int numero : numeros) {

        if(numero % 2 == 0) {
            somaPares += numero;
        }
    }
    System.out.println("Soma pares: " + somaPares);

    // Exibir valores maiores que um determinado valor
    int nums[] = {12, 6, 18, 24, 48, 5};

    int limite = 10;

    for(int i = 0; i < nums.length; i++) {

        if(nums[i] > limite) {
            System.out.println("Numero maior encontrado: " + nums[i]);
        }
    }

    String[] linguagens = {"Java", "C", "Python", "PHP", "JavaScript"};

    String linguagemAlvo = "Python";

    for(String linguagem : linguagens) {

        if(linguagemAlvo == linguagem) {
            System.out.println("Linguagem alvo encontrada! Parando o loop.");
            break;
        } else {
            System.out.println("Linguagem ainda não encontrada!");
        }
    }

    // numeros dobrado
    for(int i = 0; i < numeros.length; i++) {
        numeros[i] *= 2;
    }

    System.out.println(numeros[1]);

    for(int numero : numeros) {
        System.out.println("Numero dobrado: " + numero);
    }

    numeros[5] = 1;
    System.out.println(numeros[5]);

    String[] frutas = {"Maçã", "Banana", "Mamão"};

    for(int i = 0; i < frutas.length; i++) {

        if(frutas[i].equals("Maçã")) {
            frutas[i] = "Abacate";
        }        
    }

    for(String fruta : frutas) {
        System.out.println("As frutas do dia são: " + fruta);
    }

    // Metodo toString
    // Existem varias classe no Java, que vão ter metodos utilitários, o Arrays é uma delas
    String dadosNumericos = Arrays.toString(numeros);
    System.out.println(dadosNumericos);

    String dadosFrutas = Arrays.toString(frutas);
    System.out.println(dadosFrutas);

    int[] teste = new int[3];
    System.out.println(Arrays.toString(teste));




}
    
}
