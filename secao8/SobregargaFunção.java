package secao8;

public class SobregargaFunção {
    public static void main(String[] args) {
        
        System.out.println(soma(3, 9));
        System.out.println(soma(3, 9,5));
        System.out.println(soma(3.5, 9.7));
    }

    public static int soma(int a, int b) {

        return a + b;
    }

    public static int soma(int a, int b, int c) {

        return a + b + c;
    }

    public static double soma(double a, double b) {

        return a + b;
    }
    
}
