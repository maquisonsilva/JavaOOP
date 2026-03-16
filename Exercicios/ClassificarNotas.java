package Exercicios;

public class ClassificarNotas {
    public static void main(String[] args) {

       System.out.println(nota(100)); 
       System.out.println(nota(80)); 
       System.out.println(nota(10)); 
       System.out.println(nota(101)); 
        
    }

    public static String nota(int n) {
       
       // Validação

       if(n < 0 || n > 100) {
        return "Nota inválida";
       }
       
        switch (n / 10) {
            case 10:
            case 9: 
              return "A";
            case 8:             
              return "B";
            case 7:
              return "C";    
            case 6:
              return "D";                          
            default:
              return "F";
        }
    }
    
}
