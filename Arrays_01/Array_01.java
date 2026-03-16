package Arrays_01;

public class Array_01 {
    public static void main(String[] args) {
        
        // Declaração de array mais sem consumo de memoria
        int[] numbers;

        // inicializando o array
        numbers = new int[5];

        int[] numbers2 = {1,2,3,4,5};

        // Extrutura do array -> [0][1][2][3][4]
        int firstNum = numbers2[0];

        System.out.println(firstNum);

        // modificando o valor de um array
        numbers2[0] = 13;
        firstNum = numbers2[0];

        System.out.println(firstNum);

    }
    
}
