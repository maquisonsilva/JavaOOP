package Arrays_01;

public class Array_02_loop {
    public static void main(String[] args) {
        int[] numbers = {1,12,33,45,5,7};

        System.out.println("Array length is: " + numbers.length);

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
            System.out.println(numbers[i]);
        }

    }
    
}
