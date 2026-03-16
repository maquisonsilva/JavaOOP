package Arrays_01;

public class Array_03_loop1 {
    public static void main(String[] args) {
        
        int[] numbers = {1,12,33,45,5,7};

        System.out.println("Array length is: " + numbers.length);

        int counter = 0;

        for(int number : numbers) {
            System.out.println("Counter is: " + counter++);
            System.out.println(number);
        }

        String[] friends = {"Nasrin", "Jannick", "Ossama", "Jens"};

        for(String friend : friends) {
            System.out.println("Welcome to my party: " + friend);
        }
    }
    
}
