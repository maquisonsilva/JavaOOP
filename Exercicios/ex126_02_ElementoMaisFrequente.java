package Exercicios;

public class ex126_02_ElementoMaisFrequente {
    public static void main(String[] args) {
        int[] arrayInteiros = {10, 20, 22, 10, 13, 22, 10};

        int maisFrequente = arrayInteiros[0];

        int maxContagem = 1;

        for(int i = 0; i < arrayInteiros.length; i++){
            
            int contegem = 0;

            for(int j = 0; j < arrayInteiros.length; j++){

                if(arrayInteiros[j] == arrayInteiros[i]){
                    contegem++;
                }

                if(contegem > maxContagem){

                    maxContagem = contegem;
                    maisFrequente = arrayInteiros[i];
                }

            }            
        }

        System.out.println("O mais frequente é: " + maisFrequente);
    }
    
}
